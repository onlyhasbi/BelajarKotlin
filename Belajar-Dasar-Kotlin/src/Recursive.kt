fun factorial(number : Int) : Int{
    return when(number){
        1 -> 1
        else -> {
            number*factorial(number-1)
        }
    }

}


fun main(){
//    fun factorial(number : Int):Int {
//        var result = 1
//        for(i in number downTo 1) {
//            result *= i
//        }
//        return result
//    }

    println(factorial(10))
}