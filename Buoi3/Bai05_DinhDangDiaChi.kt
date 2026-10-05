// Nguyen Van Bao An - 25810002

fun dinhDangDiaChi(
    soNha: String,
    tenDuong: String,
    phuong: String = "Khong xac dinh",
    quan: String = "Khong xac dinh",
    thanhPho: String = "TP Ho Chi Minh"
): String = "$soNha $tenDuong, $phuong, $quan, $thanhPho"

fun main() {
    val diaChi = dinhDangDiaChi(
        soNha = "123",
        tenDuong = "Nguyen Trai",
        phuong = "Phuong 5",
        quan = "Quan 5"
    )
    println(diaChi)
}
