package data

class Car(paramBrand : String, paramName : String, paramYear : Int){
    var brand : String = paramBrand
    var name : String = paramName
    var year : Int = paramYear

    constructor(paramBrand : String, paramName : String) :
            this(paramBrand, paramName, 2020) {
                println("Mobil dengan merk $brand\nKeluaran tahun $year\n")
            }

    constructor(paramBrand : String) :
            this(paramBrand,""){
                println("Mobil dengan merk $brand")
            }

    init {
        println("Mobil $brand dibuat")
    }

}