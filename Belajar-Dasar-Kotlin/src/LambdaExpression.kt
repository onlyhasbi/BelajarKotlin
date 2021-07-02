fun capital(value : String) : String = value.toUpperCase()

fun main(){
     val contohLambda : (String, String) -> (String) = { firstName:String, lastName:String ->
         val result = "$firstName $lastName"
         result
     }

    val capitalize : (String) -> String = {
        it.toUpperCase()
    }

    val sayHello : (String,Int) -> (String) = { name:String, age:Int ->
        val result = "Hello nama saya $name, umur saya sekarang $age tahun"
        result
    }

    val greeting : (String) -> String = {
        "Hello, $it"
    }

    val toUppercase : (String) -> String = ::capital

    println(capitalize("Hasbi"))
    println(contohLambda("Muhammad","Hasbi"))
    println(sayHello("Hasbi",29))
    println(greeting("Khaulah"))
    println(toUppercase("Sandika Galih"))
}