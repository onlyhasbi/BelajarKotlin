inline fun sayHello(name : () -> String):String {
    return "Hi ${name()}"
}

inline fun fullName(firstName : ()->String, noinline  lastName : () -> String) : String {
    return "${firstName()} ${lastName()}"
}

fun main(){
   println(sayHello { "Hasbi" })
//    for(i in 1..10) {
//        println(sayHello { "Amriati" })
//    }
    println(fullName({"Muhammad"},{ "Hasbi"}))
}