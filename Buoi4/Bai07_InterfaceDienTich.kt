// Nguyen Van Bao An - 25810002

import kotlin.math.PI
import kotlin.math.pow

interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double = canh * canh
}

class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double = PI * banKinh.pow(2)
}

fun main() {
    val hv = HinhVuong(4.0)
    val ht = HinhTron(3.0)

    println("Dien tich hinh vuong: ${hv.tinhDienTich()}")
    println("Dien tich hinh tron: ${ht.tinhDienTich()}")
}