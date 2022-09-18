package ch9

import kotlin.reflect.KClass

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

    val stringValidator = validators[String::class] as FieldValidator<String>
    println(stringValidator.validate(""))
}