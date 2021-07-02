fun hello(name:String,transformer:(String)->String) : String {
    val nameTransform = transformer(name)
    return "Hello $nameTransform"
}

fun main(){
    val lambdaUpper = {value : String -> value.toUpperCase()}
    println(hello("Muhammad Hasbi",lambdaUpper))
    println(hello("Amriati",{value : String -> value.toLowerCase()}))
    println(hello("Khaulah"){value : String ->
        value.toUpperCase()
    }
    )
}