package ch9

fun <T> copyData(source: MutableList<T>, destination:MutableList<T>) {
    for(item in source) {
        destination.add(item)
    }
}

