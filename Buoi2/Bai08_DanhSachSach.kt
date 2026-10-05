// Nguyen Van Bao An - 25810002

fun main() {
    val danhSachSach = mutableListOf(
        "Mat Biec",
        "De Men Phieu Luu Ky",
        "Tuoi Tre Dang Gia Bao Nhieu",
        "So Do",
        "Cho Toi Xin Mot Ve Di Tuoi Tho"
    )

    println("=== DANH SACH BAN DAU ===")
    danhSachSach.forEachIndexed { index, sach -> println("${index + 1}. $sach") }
    danhSachSach.addAll(listOf("Toi Thay Hoa Vang Tren Co Xanh", "Doi Thua"))
    danhSachSach.remove("So Do")
    danhSachSach.sort()
    println("\n=== DANH SACH SAU KHI CAP NHAT VA SAP XEP ===")
    danhSachSach.forEachIndexed { index, sach -> println("${index + 1}. $sach") }
}