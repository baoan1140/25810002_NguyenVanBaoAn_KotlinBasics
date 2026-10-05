// Nguyen Van Bao An - 25810002

class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten".trim()
        set(value) {
            val phanTach = value.trim().split(" ", limit = 2)
            ho = phanTach.getOrElse(0) { "" }
            ten = phanTach.getOrElse(1) { "" }
        }
}

fun main() {
    val kh = KhachHang("Nguyen", "Van A")
    println("Ho ten ban dau: ${kh.hoTen}")

    kh.ten = "Van B"
    println("Ho ten sau khi doi ten: ${kh.hoTen}")

    kh.hoTen = "Tran Thi C"
    println("Ho: ${kh.ho}, Ten: ${kh.ten}")
}