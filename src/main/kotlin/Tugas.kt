fun main() {
    println("Pilihan :")
    println("1. Hitung Volume Kubus")
    println("2. Hitung Luas Persegi Panjang")
    print("Masukkan pilihan : ")
    val pilihan = readLine()

    when (pilihan) {
        "1" -> {
            print("Masukkan sisi kubus: ")
            val sisi = readLine()!!.toDouble()
            val volume = sisi * sisi * sisi
            println("Volume kubus adalah $volume")
        }
        "2" -> {
            print("Masukkan panjang persegi panjang: ")
            val panjang = readLine()!!.toDouble()
            print("Masukkan lebar persegi panjang: ")
            val lebar = readLine()!!.toDouble()
            val luas = panjang * lebar
            println("Luas persegi panjang adalah $luas")
        }
        else -> {
            println("Pilihan tidak valid.")
        }
    }
}
