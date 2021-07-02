
fun hi(name:String,transformer:(String)->String) : String {
    val nameTransform = transformer(name)
    return "Hello $nameTransform"
}

fun main(){
    val toUpper = fun(value:String) : String {
        if(value=="") {
            return "Ups"
        } else {
            return value.toUpperCase()
        }
    }

    println(hi("Hasbi",toUpper))
    println(hi("Khalid",fun(value:String):String {
        return value.toLowerCase()}))
}