// !DIAGNOSTICS: -UNUSED_PARAMETER

open class Base<T>(p: Any?) {
    fun foo1(t: T) {}
}

class D: Base<Int>(1) {
    inner class B : Base<Int> {
        constructor() : super(foo1(1))
        constructor(x: Int) : super(this<!UNRESOLVED_LABEL!>@B<!>.foo1(1))
        constructor(x: Int, y: Int) : super(this@D.foo1(1))
    }
}
