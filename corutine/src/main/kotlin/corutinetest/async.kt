package corutinetest

import kotlinx.coroutines.*

fun sumAll() {
    runBlocking {
        val d1 = async { delay(1000L); 1 }
        log("after async(d1)")
        val d2 = async { delay(2000L); 2 }
        log("after async(d2)")
        val d3 = async { delay(3000L); 3 }
        log("after async(d3)")

        log("1+2+3 = ${d1.await() + d2.await() + d3.await()}")
        log("after await all & add")
    }
}

fun launchStyleTest() {
    runBlocking {
        launch {
            println("main runBlocking : working in thread ${Thread.currentThread().name}")
        }
        launch (Dispatchers.Unconfined) {
            println("Unconfined : working in thread ${Thread.currentThread().name}")
        }
        launch (Dispatchers.Default) {
            println("Default : working in thread ${Thread.currentThread().name}")
        }
        launch (newSingleThreadContext("MyOwnThread")) {
            println("newSingleThreadContext : working in thread ${Thread.currentThread().name}")
        }
    }
}

fun main() {
//    sumAll()
    launchStyleTest()
}