fun String.hello() : String = "Hello, $this"
fun String.printHello() : Unit = println("Hello, $this")

fun main(){
    val nama = "Hasbi"
    println(nama.hello())
    "Amriati".printHello()
    "Khaulah".printHello()
    nama.printHello()
}