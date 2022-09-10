package ch6

fun main(args:Array<String>) {
    for(i in args.indices) {
        println("Argument $i is: ${args[i]}")
    }
}