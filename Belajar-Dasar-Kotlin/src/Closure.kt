fun main(){
    var count = 0

    val lambaIncrement : () -> Unit ={
        println("Lambda Increment")
        count++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Increment")
        count++;
    }

    fun increment(){
        println("Function Increment")
        count++
    }

    lambaIncrement()
    anonymousIncrement()
    increment()

    lambaIncrement()
    anonymousIncrement()
    increment()

    println(count)
}