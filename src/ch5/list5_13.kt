package ch5

import java.io.File

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main() {
    var file = File("/Users/svtk/.HiddenDir/a.txt")
}
