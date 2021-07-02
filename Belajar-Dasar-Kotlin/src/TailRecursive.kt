//tailrec fun displayNumber(number : Int){
//    println("recursive $number")
//    if(number>0)
//        displayNumber(number-1)
//}

tailrec fun factor(number : Long,total : Long = 1L) : Long {
    return when(number){
        1L -> total
        else -> {
            factor(number-1,total*number)
        }
    }
}

fun main(){
//    displayNumber(10_000)

println(factor(10))
}