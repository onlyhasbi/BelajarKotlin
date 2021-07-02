fun sayHello(namaDepan : String, namaBelakang : String?){
    if(namaBelakang==null){
        println("Hi, $namaDepan")
    } else {
        println("Hi, $namaDepan $namaBelakang")
    }
}

fun perkenalan(nama : String, umur:Int){
    println("Assalaamu 'Alaikum")
    println("Hi, Perkenalkan nama saya $nama \nUmur saya $umur tahun \nMohon Kerjasamanya")
}

fun main(){
    sayHello("Andi Muhammad Hasbi",null)
    sayHello("Amriati","Amril")
    perkenalan("Hasbi",28)
}