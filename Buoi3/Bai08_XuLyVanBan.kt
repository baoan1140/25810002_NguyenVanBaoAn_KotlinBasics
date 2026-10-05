// Nguyen Van Bao An - 25810002

fun String.xuLy(action: (String) -> String): String = action(this)

fun vietHoaToanBo(vanBan: String): String = vanBan.uppercase()

fun main() {
    val vanBan = "hello kotlin"

    val ketQua1 = vanBan.xuLy { it.reversed() }
    val ketQua2 = vanBan.xuLy(::vietHoaToanBo)
    val ketQua3 = vanBan.xuLy { it.trim() }

    println(ketQua1)
    println(ketQua2)
    println(ketQua3)
}