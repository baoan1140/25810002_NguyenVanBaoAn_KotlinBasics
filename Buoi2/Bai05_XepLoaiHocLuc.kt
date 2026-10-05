// Nguyen Van Bao An - 25810002

fun main() {
    val diemTB: Double = 7.8

    val xepLoai: String = when (diemTB) {
        in 9.0..10.0 -> "Xuat sac"
        in 8.0..8.9 -> "Gioi"
        in 6.5..7.9 -> "Kha"
        in 5.0..6.4 -> "Trung binh"
        else -> "Yeu"
    }

    println("Diem trung binh: $diemTB")
    println("Xep loai hoc luc: $xepLoai")
}
