// Nguyen Van Bao An - 25810002

open class DongVat(val ten: String) {
    open fun keu(): String = "..."
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String = "Gau gau"
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String = "Meo meo"
}

fun main() {
    val danhSach: List<DongVat> = listOf(Cho("Lu"), Meo("Mimi"))
    danhSach.forEach { println("${it.ten} keu: ${it.keu()}") }
}