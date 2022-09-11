package corutinetest

import kotlinx.coroutines.delay
import kotlinx.coroutines.yield

suspend fun yieldThreeTimes() {
    log("1")
    delay(1000L)
    yield()
    log("2")
    delay(1000L)
    yield()
    log("3")
    delay(1000L)
    yield()
    log("4")
}

//Keyword 1.Suspend function 2.CPS style