// Nguyen Van Bao An - 25810002

fun main() {
    var soHienTai = 0
    var soTiepTheo = 1
    var viTri = 0

    while (soHienTai < 100) {
        println("Vi tri $viTri: $soHienTai")
        val tong = soHienTai + soTiepTheo
        soHienTai = soTiepTheo
        soTiepTheo = tong
        viTri++
    }
}
