package data

class Person(
        var firstName : String="",
        var middleName : String="",
        var lastName : String="" )
    {

        fun sayHello(name : String) {
            println("Hi $name, i'am ${firstName} ${middleName} ${lastName}")
            println("Nice to meet you\n")
        }

        fun sayHello(firstName : String, lastName : String) {
            println("Hi $firstName $lastName, salam kenal.\nSaya ${this.firstName} $middleName ${this.lastName}" )
            println("Nice to meet you\n")
        }

        fun run(){
            println("I'm run\n")
        }

        fun getFullName() : String {
            return "$firstName $middleName $lastName"
        }
}

