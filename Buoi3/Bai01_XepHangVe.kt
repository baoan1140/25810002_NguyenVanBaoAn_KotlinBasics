// Nguyen Van Bao An - 25810002

fun main() {
    val tuoi = 15

    val loaiVe = when {
        tuoi < 13 -> "Ve tre em"
        tuoi >= 60 -> "Ve cao tuoi"
        else -> "Ve nguoi lon"
    }

    println("Tuoi: $tuoi")
    println("Loai ve: $loaiVe")
}
