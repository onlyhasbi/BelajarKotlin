const val APPLICATION = "Belajar Kotlin";

fun main(){
    var namaDepan = "Andi Muhammad Hasbi"
    var namaBelakang = "Haerurrijal"
    var umur = 32;
    val programming = "Java Kotlin" // tidak bisa diubah
    var kendaraan : String?;
    kendaraan = "Motor";

    println("$namaDepan $namaBelakang")
    println(umur)
    println(programming)
    println("Kendaraan = $kendaraan")
    println("Total Karakter = ${kendaraan?.length}")
    println(APPLICATION)
}