package data

class Address{
    var street : String = ""
    var city : String = ""
    var country : String = "Indonesia"

    constructor(paramStreet : String, paramCity : String, paramCountry : String) {
        street = paramStreet
        city = paramCity
        country = paramCountry
    }

    constructor(paramStreet: String,paramCity: String)
            : this(paramStreet,paramCity,"Default"){

            }

    constructor(paramStreet: String)
            : this(paramStreet,"Default")

}