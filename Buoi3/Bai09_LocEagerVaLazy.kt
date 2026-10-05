// Nguyen Van Bao An - 25810002

fun main() {
    val nhacCu = listOf("Piano", "Guitar", "Trong", "Violin", "Trumpet", "Flute", "Cello", "Trombone")
    val chuCai = 'T'

    println("=== EAGER (Collection) ===")
    val locEager = nhacCu
        .filter { 
            println("Filter Eager: $it")
            it.startsWith(chuCai) 
        }
        .take(2)
    println("Ket qua Eager: $locEager\n")

    println("=== LAZY (Sequence) ===")
    val locLazy = nhacCu.asSequence()
        .filter { 
            println("Filter Lazy: $it")
            it.startsWith(chuCai) 
        }
        .take(2)
        .toList()
    println("Ket qua Lazy: $locLazy")
}
