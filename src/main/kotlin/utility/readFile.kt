package utility

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.readLines

fun readLine(fileName:String) : String {
    return File(fileName).readText()
}

fun readFile(fileName:String) : List<String> {
    return Path(fileName).readLines()
}