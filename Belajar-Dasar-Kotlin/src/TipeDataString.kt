fun main(){
    var namaDepan : String = "Muhammad"
    var namaBelakang : String = "Hasbi Haerurrijal"
    var banyakTeks : String = """
        |ini adalah contoh
        |ketikan teks yang banyak
        |menggunakan petik 3 kali
    """.trimMargin()

    //var fullName : String = namaDepan+" "+namaBelakang // cara lama
    var namaLengkap : String = "$namaDepan $namaBelakang |";

    print(namaLengkap)
    println("Jumlah Karakter Nama ${namaDepan.length}")
    println(banyakTeks)
}