// Nguyen Van Bao An - 25810002

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau
        private set

    init {
        require(soDuBanDau >= 0) { "So du ban dau khong duoc am: $soDuBanDau" }
        println("Tao tai khoan $soTaiKhoan thanh cong | So du: %,.0f VND".format(soDu))
    }

    fun guiTien(soTien: Double) {
        require(soTien > 0) { "So tien gui phai lon hon 0" }
        soDu += soTien
    }

    fun rutTien(soTien: Double) {
        require(soTien in 0.0..soDu) { "So tien rut khong hop le hoac vuot qua so du" }
        soDu -= soTien
    }
}

fun main() {
    val tk1 = TaiKhoanNganHang("TK001", 1000000.0)
    
    runCatching {
        val tk2 = TaiKhoanNganHang("TK002", -500000.0)
    }.onFailure { println("Loi: ${it.message}") }
}
