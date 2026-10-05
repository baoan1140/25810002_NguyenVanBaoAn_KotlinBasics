// Nguyen Van Bao An - 25810002

data class SinhVien(val mssv: String, val hoTen: String, val diemTrungBinh: Double)

val SinhVien.xepLoai: String
    get() = when {
        diemTrungBinh >= 8.5 -> "Xuat sac"
        diemTrungBinh >= 8.0 -> "Gioi"
        diemTrungBinh >= 6.5 -> "Kha"
        diemTrungBinh >= 5.0 -> "Trung binh"
        else -> "Yeu"
    }

fun main() {
    val sv1 = SinhVien("SV001", "Nguyen Thanh An", 8.5)
    val sv2 = SinhVien("SV001", "Nguyen Thanh An", 8.5)
    println(sv1)
    println("So sanh sv1 == sv2: ${sv1 == sv2}")
    val sv3 = sv1.copy(diemTrungBinh = 9.0)
    println(sv3)
    val (mssv, hoTen, diem) = sv3
    println("MSSV: $mssv | Ho ten: $hoTen | Diem: $diem | Xep loai: ${sv3.xepLoai}")
}
