fun main(){
//    var nilai = 'D'
//
//    when (nilai) {
//        'A' -> println("Mantap")
//        'B' -> println("Oke")
//        'C' -> println("Lumayan")
//        'D' -> println("Goblok")
//        else -> println("Gak ada obat")
//    }
//
//    when (nilai) {
//        'A','B','C' -> println("Selamat yah, kamu lulus")
//        else -> println("HAHAHA mengulangko")
//    }

//    val nilaix = 33
//
//    val nilaiLulus : Array<Int> = arrayOf(45,32,52);
//    when(nilaix){
//        in nilaiLulus -> println("Nilainya ada didalam daftar")
//        !in nilaiLulus -> println("Nilainya gak ada tuh")
//    }
//
//    when(nilaix) {
//        is Int -> println("Tipe datanya Integer dong")
//        !is Int -> println("Tipe datanya bukan Integer dong")
//    }
//
    val nilai =40
    when {
        nilai > 90 && nilai < 100 -> println("Luar Biasa")
        nilai > 80 -> println("Mantap be")
        nilai > 70 -> println("Lumayan")
        nilai > 60 -> println("Oke")
        nilai > 50 -> println("Oon lu")
        else -> println("Dompala")
    }
}