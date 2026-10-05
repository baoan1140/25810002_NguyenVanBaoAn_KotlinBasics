// Nguyen Van Bao An - 25810002

fun main() {
    val diemSo = doubleArrayOf(7.5, 8.0, 6.5, 9.0, 5.5, 4.0, 10.0, 8.5, 7.0, 6.0)

    val diemTB = diemSo.average()
    val diemCaoNhat = diemSo.maxOrNull() ?: 0.0
    val diemThapNhat = diemSo.minOrNull() ?: 0.0

    println("Diem trung binh ca lop: $diemTB")
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")
}
