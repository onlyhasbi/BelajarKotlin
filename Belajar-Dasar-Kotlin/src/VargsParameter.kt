fun hitung(operator : Char, vararg values : Int) : Int {
    var total=0
    when(operator){
        '+' -> {
            for(value in values) {
                total+=value
            }
        }
        '-' -> {
            for(value in values) {
                total-=value
            }
        }
        '*' -> {
            total = 1
            for(value in values) {
                total*=value
            }
        }
        '/' -> {
            for(value in values) {
                total/=value
            }
        }
    }
    return total
}

fun main(){
    println(hitung('+',10,9,5,1))
    println(hitung('*',10,10,10,10))
    println(hitung('-',100,10,10,10))
}