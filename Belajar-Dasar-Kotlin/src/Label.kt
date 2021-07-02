fun main(){
    loopI@ for(i in 1..10)
        loopJ@ for(j in 1..10){
//            if(i>5){
//                break@loopI
//            }
            if(i==5){
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }

    fun test(name:String, operation : (String) -> Unit) = operation(name)

    test("Eko") test@ {
        if(it==""){
            return@test
        } else {
            println("Eko")
        }
    }
}