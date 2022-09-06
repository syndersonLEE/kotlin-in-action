package ch2

import java.lang.IllegalArgumentException

fun eval(e : Expr) : Int =
    if(e is Num) {
        e.value
    } else if(e is Sum) {
        eval (e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(eval(Sum(Num(1), Num(2))))
}