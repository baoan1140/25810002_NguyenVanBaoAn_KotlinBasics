// Nguyen Van Bao An - 25810002

import kotlin.math.sqrt

fun String.demNguyenAm(): Int = count { it.lowercaseChar() in "aeiou" }

fun Int.laSoNguyenTo(): Boolean = when {
    this < 2 -> false
    else -> (2..sqrt(toDouble()).toInt()).none { this % it == 0 }
}

fun main() {
    println("Kotlin".demNguyenAm())
    println("Xin chao cac ban".demNguyenAm())
    println("AEIOU".demNguyenAm())

    println(7.laSoNguyenTo())
    println(10.laSoNguyenTo())
    println(13.laSoNguyenTo())
}
