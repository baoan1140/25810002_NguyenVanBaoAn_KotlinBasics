// Nguyen Van Bao An - 25810002

val String.isHopLe: Boolean
    get() = length >= 8

fun main() {
    val danhSachMatKhau = listOf("abc123", "matkhau123", "12345678")

    danhSachMatKhau.forEach { mk ->
        println("$mk -> ${mk.isHopLe}")
    }
}