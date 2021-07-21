/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api.element.builder

import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.resolve.ResolutionMode
import org.jetbrains.kotlin.fir.resolve.ScopeSession
import org.jetbrains.kotlin.fir.resolve.transformers.ReturnTypeCalculator
import org.jetbrains.kotlin.fir.resolve.transformers.body.resolve.BodyResolveContext
import org.jetbrains.kotlin.fir.resolve.transformers.body.resolve.FirDesignatedBodyResolveTransformerForReturnTypeCalculator
import org.jetbrains.kotlin.fir.resolve.transformers.body.resolve.ImplicitBodyResolveComputationSession
import org.jetbrains.kotlin.fir.symbols.ensureResolved
import org.jetbrains.kotlin.fir.types.FirImplicitTypeRef
import org.jetbrains.kotlin.idea.fir.low.level.api.api.FirDeclarationDesignation
import org.jetbrains.kotlin.idea.fir.low.level.api.lazy.resolve.FirLazyBodiesCalculator

fun FirIdeDesignatedImpliciteTypesBodyResolveTransformerForReturnTypeCalculator(
    designation: Iterator<FirElement>,
    session: FirSession,
    scopeSession: ScopeSession,
    implicitBodyResolveComputationSession: ImplicitBodyResolveComputationSession,
    returnTypeCalculator: ReturnTypeCalculator,
    outerBodyResolveContext: BodyResolveContext?,
): FirDesignatedBodyResolveTransformerForReturnTypeCalculator {

    val designationList = mutableListOf<FirElement>()
    for (element in designation) {
        designationList.add(element)
    }
    require(designationList.isNotEmpty()) { "Designation should not be empty" }

    return FirIdeDesignatedBodyResolveTransformerForReturnTypeCalculatorImpl(
        designationList,
        session,
        scopeSession,
        implicitBodyResolveComputationSession,
        returnTypeCalculator,
        outerBodyResolveContext
    )
}

private class FirIdeDesignatedBodyResolveTransformerForReturnTypeCalculatorImpl(
    private val designation: List<FirElement>,
    session: FirSession,
    scopeSession: ScopeSession,
    implicitBodyResolveComputationSession: ImplicitBodyResolveComputationSession,
    returnTypeCalculator: ReturnTypeCalculator,
    outerBodyResolveContext: BodyResolveContext?,
) : FirDesignatedBodyResolveTransformerForReturnTypeCalculator(
    designation.iterator(),
    session,
    scopeSession,
    implicitBodyResolveComputationSession,
    returnTypeCalculator,
    outerBodyResolveContext
) {
    private val targetDeclaration = designation.last()

    private inline fun <D : FirCallableDeclaration> D.processCallable(body: (FirDeclarationDesignation) -> Unit) {
        if (this !== targetDeclaration) return
        ensureResolved(FirResolvePhase.TYPES)
        if (returnTypeRef !is FirImplicitTypeRef) return
        val declarationList = designation.filterIsInstance<FirDeclaration>()
        check(declarationList.isNotEmpty()) { "Invalid empty declaration designation" }
        body(FirDeclarationDesignation(declarationList.dropLast(1), this))
    }

    override fun transformSimpleFunction(
        simpleFunction: FirSimpleFunction,
        data: ResolutionMode
    ): FirSimpleFunction {
        simpleFunction.processCallable {
            FirLazyBodiesCalculator.calculateLazyBodiesForFunction(it)
        }
        return super.transformSimpleFunction(simpleFunction, data)
    }

    override fun transformProperty(
        property: FirProperty,
        data: ResolutionMode
    ): FirProperty {
        property.processCallable {
            FirLazyBodiesCalculator.calculateLazyBodyForProperty(it)
        }
        return super.transformProperty(property, data)
    }
}
