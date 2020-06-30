package com.example.helloworld

fun main(args: Array<String>) {

    var kabir = Person("Kabir","Singh")
    var roshan = Person()
    var shubham = Person(firstName = "Shubham")
    var asha = Person(lastName = "Rajkumar")
}

class Person constructor(firstName:String = "ROSHAN", lastName:String = "RAUT"){
    //initializer block
    init{
        println("Initialized firstName as $firstName and lastName as $lastName")
    }
}
//Challenge
/*
fun main(args: Array<String>) {
    var phone1 = MobilePhone("Android","Samsung","Galaxy S20 Ultra")
    var phone2 = MobilePhone()
    var phone3 = MobilePhone("kitkat")
    var phone4 = MobilePhone(brand="Nokia",model="Lumia")
    var phone5 = MobilePhone(osName="jellyBeans")
    var phone6 = MobilePhone(brand="iphone")
}

class MobilePhone(osName: String = "jelly beans",brand:String ="Samsung", model:String = "J7"){
    //initializer
    init{
        println("Intialized the mobilePhone Object with OS = $osName ,brand= $brand ,model= $model ")
    }
}
 */