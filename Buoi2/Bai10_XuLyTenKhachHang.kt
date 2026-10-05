// Nguyen Van Bao An - 25810002

fun String?.layTenHienThi(): String = this ?: "Khach vang lai"
fun String?.tinhDoDai(): Int = this?.length ?: 0

fun main() {
    val tenKhachHang1: String? = "Nguyen Van A"
    val tenKhachHang2: String? = null
    val tenKhachHang3: String? = "Tran Thi B"
    println("Do dai ten 1: ${tenKhachHang1.tinhDoDai()}")
    println("Do dai ten 2: ${tenKhachHang2.tinhDoDai()}")
    println("Ten hien thi 1: ${tenKhachHang1.layTenHienThi()}")
    println("Ten hien thi 2: ${tenKhachHang2.layTenHienThi()}")
    tenKhachHang3?.let { ten ->
        println("Do dai ten 3 (xu ly an toan voi let): ${ten.length}")
    }
}