fun greeting(nama : String = "") : String {
    return when(nama){
        "" -> "Hello Guys"
        else -> "Hello $nama"
    }

//    return if( nama == "" ) {
//        "Hello Bro and Sis"
//    } else {
//        "Hello $nama"
//    }
}



fun main(){
    println(greeting("John"))
}