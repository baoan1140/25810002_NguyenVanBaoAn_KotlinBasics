// Nguyen Van Bao An - 25810002

fun main() {
    println("Dem nguoc:")
    (10 downTo 1).forEach { println(it) }

    println("In dong co dinh:")
    repeat(5) { index ->
        println("${index + 1}. Xin chao Kotlin!")
    }
}