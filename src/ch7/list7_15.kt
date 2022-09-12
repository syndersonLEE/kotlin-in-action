package ch7

data class NameComponent (
    val name: String,
    val extension: String)

fun splitFilename_2(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}
