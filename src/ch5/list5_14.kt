package ch5

fun createAllDoneRunnable() : Runnable {
    return Runnable { println("All done") }
}

fun main() {
    createAllDoneRunnable().run()
}