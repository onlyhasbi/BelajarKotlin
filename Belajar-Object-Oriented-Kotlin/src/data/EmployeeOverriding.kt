package data

open class Employee(val name : String){
    open fun sayHello(name:String){
        println("Hello $name, My name is ${this.name}\nI'm an Employee")
    }
}

open class Manager(name : String) : Employee(name){
    final override fun sayHello(name:String){
        println("Hello $name, My name is ${this.name}\nI'm an Manager\n")
    }
}

class SuperManager(name : String) : Manager(name){
//    ERROR tidak bisa di override karena fun di manager final
//    override fun sayHello(name:String){
//        println("Hello $name, My name is ${this.name}\nI'm an Super Manager\n")
//    }
}


class VicePresident(name : String) : Employee(name){
    override fun sayHello(name:String){
        println("Hello $name, My name is ${this.name}\nI'm an Vice President")
    }
}