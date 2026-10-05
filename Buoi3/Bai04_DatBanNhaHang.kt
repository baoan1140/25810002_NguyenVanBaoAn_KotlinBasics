// Nguyen Van Bao An - 25810002

fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Ban thuong") =
    println("Khach hang: $tenKhachHang | So luong: $soLuongKhach | Loai ban: $loaiBan")

fun main() {
    datBan("Nguyen Van A", 4)
    datBan("Tran Thi B", 2, "Ban VIP")
    datBan(loaiBan = "Ban ngoai troi", tenKhachHang = "Le Van C", soLuongKhach = 6)
}
