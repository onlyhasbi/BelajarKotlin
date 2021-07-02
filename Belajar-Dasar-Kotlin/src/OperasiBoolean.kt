fun main(){
    val finalExam = 80
    val attendant = 75

    val passFinalExam = finalExam>75
    val passAttendant = attendant>80

    val pass = passFinalExam && passAttendant

    println(pass)
}