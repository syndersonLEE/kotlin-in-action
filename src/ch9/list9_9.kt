package ch9

inline fun <reified T>
        Iterable<*>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()

    for (element in this) {
        if(element is T) {
            destination.add(element)
        }
    }
    return destination
}

