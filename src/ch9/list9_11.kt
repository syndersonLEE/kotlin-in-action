package ch9

open class Animal {
    fun feed() {
        println("feed")
    }
}

class Herd<T : Animal> {
    val size : Int
        get () {
            return 1
        }
    operator fun get(i : Int) : T {
        return this[i]
    }
}

class Cat : Animal () {
    fun cleanLitter() {}

    fun takeCareOFCats(cats: Herd<Cat>) {
        for (i in 0 until cats.size) {
            cats[i].cleanLitter()
        }
    }
}