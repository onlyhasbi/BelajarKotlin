fun main(){

    //Tipe Data Number

    var angkaInteger : Int
    var angkaFloat : Float
    var angkaBinary : Int
    var angkaLong : Long

    angkaInteger = 25
    angkaFloat = 10.11f
    angkaBinary = 0b0101010101 //format angka secara literal untuk tipe data integer
    angkaLong = 9_000_000_000 //pemberian underscore untuk mempermudah membaca jumlah angka


    println("Belajar Java Dasar | Mengenal Tipe Data")
    println("Angka Integer : "+angkaInteger)
    println("Angka Float : "+angkaFloat)
    println("Angka Binary : "+angkaBinary)
    println("Angka Long : "+angkaLong)

    //conversion

    println("Konversi dari Binary ke Integer "+(angkaBinary.toInt()-100))

}