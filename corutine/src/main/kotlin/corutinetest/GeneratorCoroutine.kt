package corutinetest

import kotlin.coroutines.RestrictsSuspension
import kotlin.coroutines.startCoroutine

interface Generator<out R, in T> {
    fun next(param: T): R?
}

@RestrictsSuspension
interface GeneratorBuilder<in T, R> {
    suspend fun yield(value: T) : R
    suspend fun yieldAll(generator: Generator<T, R>, params: R)
}

fun <T, R> generate(block: suspend GeneratorBuilder<T, R>.(R) -> Unit) : Generator<T, R> {
    val coroutine = GeneratorCoroutine<T, R>()
    val initial: suspend (R) -> Unit = { result -> block(coroutine, result )}
    coroutine.nextStep = { param -> initial.startCoroutine(param, coroutine) }
    return coroutine
}

internal class GeneratorCoroutine<T, R>: Generator<T, R>, GeneratorBuilder<T, R> {
    lateinit var nextStep: (R) -> Unit
    private var lastValue: T? = null
    private var lastException: Throwable? = null

    //Generator<T,R> 구현

    override fun next(param: R) : T? {
        nextStep(param)
        lastException?.let {throw it}
        return lastValue
    }

    //GeneratorBuilder<T,R> 구현

    override suspend fun yield(value: T): R =
        suspendCoroutineUniterceptedOrReturn {
                cont ->
                    lastValue = value
                    nextStep = { param -> cont.resume(param)}
                    COROUTINE_SUSPENDED
        }

    override suspend fun yieldAll(generator: Generator<T, R>, param: R) : Unit =
        suspendCoroutineUniterceptedOrReturn sc@ {
                cont ->
                    lastValue = generator.next(param)
                    if(lastValue == null) return@sc Unit
                    nextStep = {
                        param ->
                            lastValue = generator.next(param)
                            if(lastValue == null) cont.resume(Unit)
                    }
                    COROUTINE_SUSPENDED
        }

    override val context: CoroutineContext get() = EmptyCoroutineContext

    override fun resumeWith(result: Result<Unit>) {
        result
            .onSuccess{ lastValue = null }
            .onFailure{ lastException = it}
    }
}

fun idMaker() = generate<Int, Unit> {
    var index = 0
    while(index < 3)
        yield(index++)

}

fun main() {
    val gen = idMaker()
    println(gen.next(Unit))
    println(gen.next(Unit))
    println(gen.next(Unit))
    println(gen.next(Unit))
}