fun main(){
    val member : Array<String> = arrayOf("Hasbi","Wardin","Khaulah")
    member.set(0,"Khalid")

    println(member[0])
    println(member.get(2))

    val number : Array<Int> = arrayOf(12,45,67)
    println(number.get(2))

    val members : Array<String?> = arrayOfNulls(5);
    members.set(0,"Hasbi")
    members.set(1,"Khaulah")
    members.set(2,"Khalid")
    members.set(3,"Amo")
    members.set(4,"Wardin")

    for(listMember in members) {
        println(listMember)
    }

}