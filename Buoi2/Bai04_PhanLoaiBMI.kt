// Nguyen Van Bao An - 25810002

fun main() {
    val CanNang: Double = 65.0
    val ChieuCao: Double = 1.7

    val bmi: Double = CanNang / (ChieuCao * ChieuCao)

    val phanLoai: String
    if (bmi < 18.5) {
        phanLoai = "Gay"
    } else if (bmi < 25.0) {
        phanLoai = "Binh thuong"
    } else if (bmi < 30.0) {
        phanLoai = "Thua can"
    } else {
        phanLoai = "Beo phi"
    }

    println("Can nang: $CanNang kg, Chieu cao: $ChieuCao m")
    println("Chi so BMI: $bmi")
    println("Phan loai: $phanLoai")
}
