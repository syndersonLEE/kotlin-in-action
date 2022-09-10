package ch6

class StringPrinter : list6_18.StringProcessor {
    override fun process(value: String?) {
        println(value)
    }
}

class NullableStringPrinter: list6_18.StringProcessor {
    override fun process(value: String?) {
        if(value != null) {
            println(value)
        }
    }
}

fun main() {
    StringPrinter().process("test")
}