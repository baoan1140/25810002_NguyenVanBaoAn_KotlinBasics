// Nguyen Van Bao An - 25810002

fun main() {
    tinhHoaDon(soLuong = 5, donGia = 25000.0)
}

fun tinhHoaDon(soLuong: Int, donGia: Double, thueSuat: Double = 0.08) {
    val tienHang = soLuong * donGia
    val thue = tienHang * thueSuat
    val tongTien = tienHang + thue

    println("""
        === HOA DON BAN HANG ===
        So luong san pham: $soLuong
        Don gia: $donGia VND
        Tien hang (chua thue): $tienHang VND
        Thue (${(thueSuat * 100).toInt()}\%):$thue VND
        Tong tien phai tra: $tongTien VND
    """.trimIndent())
}