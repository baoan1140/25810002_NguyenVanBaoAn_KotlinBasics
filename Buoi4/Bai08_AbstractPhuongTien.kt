// Nguyen Van Bao An - 25810002

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int

    fun moTa() = println("Phuong tien co toc do toi da la $tocDoToiDa km/h")
}

class XeMay(override val tocDoToiDa: Int = 80) : PhuongTienDiChuyen()
class OTo(override val tocDoToiDa: Int = 180) : PhuongTienDiChuyen()

fun main() {
    val danhSachPhuongTien = listOf(XeMay(), OTo(), XeMay(100))
    danhSachPhuongTien.forEach { it.moTa() }
}
