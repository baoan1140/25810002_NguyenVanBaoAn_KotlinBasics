// Nguyen Van Bao An - 25810002

fun Int.binhPhuong(): Int = this * this
fun Double.chuViHinhVuong(): Double = this * 4
fun Int.laSoChan(): Boolean = this % 2 == 0

fun main() {
    println("Binh phuong: ${5.binhPhuong()}")
    println("Chu vi hinh vuong: ${4.0.chuViHinhVuong()}")
    println("La so chan: ${7.laSoChan()}")
}