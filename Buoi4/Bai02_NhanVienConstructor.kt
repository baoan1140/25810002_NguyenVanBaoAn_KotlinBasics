// Nguyen Van Bao An - 25810002

class NhanVien(
    val maNhanVien: String = "TAM",
    val ten: String,
    var luongThang: Double = 0.0
)

fun main() {
    val nv1 = NhanVien("NV001", "Nguyen Van A", 8000000.0)
    val nv2 = NhanVien(ten = "Tran Thi B")

    println("NV1: id=${nv1.maNhanVien}, ten=${nv1.ten}, luong=${nv1.luongThang}")
    println("NV2: id=${nv2.maNhanVien}, ten=${nv2.ten}, luong=${nv2.luongThang}")
}