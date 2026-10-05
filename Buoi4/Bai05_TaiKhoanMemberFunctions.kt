// Nguyen Van Bao An - 25810002

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau
        private set

    fun napTien(soTien: Double) {
        require(soTien > 0) { "So tien nap phai lon hon 0" }
        soDu += soTien
    }

    fun rutTien(soTien: Double): Boolean {
        require(soTien > 0) { "So tien rut phai lon hon 0" }
        if (soDu < soTien) return false
        soDu -= soTien
        return true
    }
}

fun main() {
    val tk = TaiKhoanNganHang("TK001", 1000000.0)

    tk.napTien(500000.0)
    println("So du sau khi nap tien: ${tk.soDu}")

    val ketQua1 = tk.rutTien(2000000.0)
    println("Rut 2000000 thanh cong: $ketQua1, so du: ${tk.soDu}")

    val ketQua2 = tk.rutTien(1000000.0)
    println("Rut 1000000 thanh cong: $ketQua2, so du: ${tk.soDu}")
}