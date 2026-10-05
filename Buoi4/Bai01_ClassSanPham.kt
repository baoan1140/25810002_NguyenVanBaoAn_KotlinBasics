// Nguyen Van Bao An - 25810002

data class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sp1 = SanPham("Ban phim", 250000.0, 10)
    val sp2 = SanPham(tenSanPham = "Chuot may tinh", gia = 150000.0)

    println("San pham 1: $sp1")
    println("San pham 2: $sp2")
}