package ch3

fun parsePath_2(path : String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir : $directory, name : $filename, ext: $extension")
    }
}

