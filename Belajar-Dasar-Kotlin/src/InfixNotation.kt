infix fun String.to(type : String) : String {
    if(type=="UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main(){
    println("Muhammad Hasbi" to "LO")
}