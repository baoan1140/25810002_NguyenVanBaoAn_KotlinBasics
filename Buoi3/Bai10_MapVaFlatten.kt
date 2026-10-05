// Nguyen Thanh An - 25810002

fun main() {
    val danhSachSo = listOf(1, 2, 3, 4, 5)
    val danhSachNhanDoi = danhSachSo.map { it * 2 }
    println("Danh sach nhan doi: $danhSachNhanDoi")

    val danhSachLongNhau = listOf(listOf(1, 2), listOf(3, 4, 5), listOf(6))
    val danhSachPhangNhanDoi = danhSachLongNhau.flatMap { subList -> subList.map { it * 2 } }
    println("Danh sach phang va nhan doi: $danhSachPhangNhanDoi")
}
