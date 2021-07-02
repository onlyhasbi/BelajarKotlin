fun namaLengkap(namaDepan:String = "", namaBelakang : String = ""){
    if(namaDepan.isNullOrEmpty() && namaBelakang.isNullOrEmpty())
        println("Hi Anonymous, Welcome to Kotlin")

    if(namaDepan.isNotEmpty() && namaBelakang.isNullOrEmpty())
        println("Hello $namaDepan, Welcome to Kotlin")

    if(namaDepan.isNullOrEmpty() && namaBelakang.isNotEmpty())
        println("Hello $namaBelakang, Welcome to Kotlin")

    if(namaDepan.isNotEmpty() && namaBelakang.isNotEmpty())
        println("Helo $namaDepan $namaBelakang, Welcome to Kotlin")
}

fun main(){
    namaLengkap()
    namaLengkap("Hasbi")
    namaLengkap("Muhammad","Hasbi")
}