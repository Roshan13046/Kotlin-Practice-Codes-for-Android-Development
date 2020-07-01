package com.example.helloworld



//Iheritance is derivng a new class from parent class.
//It activates code reusability feature of OOP.

//To use inheritance we have to make the parent class open bcz in kotln every class is by default final ie they are not inheritable so to make it extensible or inheritable we have to make it open using open keyword before the parent class

//Super class,Parent Class ,Base Class of Car


open class Car(val name:String , val brand:String){ //note: open keyword
    open var range : Double = 0.0//note:making the datamember open for overriding it

    fun extendRange(amount :Double){
        if(amount > 0){
            range += amount
        }
    }

    open fun drive(distance : Double){ //note: making the drive function open for overriding
        if(distance > 0){
            println("Drive for $distance")
        }
    }
}

//child class,sub class, derived class
class Ecar(name : String,brand:String ,batteryLife: Double ):Car(name,brand){ //note the parent class constructor is must

    var battery :Double = batteryLife
    //Note: To override a data member or member function first make it open in parent class
    override var range  = batteryLife * 2


    //Some polymorhism concepts using overriding
    override fun drive(distance:Double){
        println("Drived the Electric car for $distance KM on electricity")
    }

    fun drive(){
        println("The Range of Car is $range on electricity")
    }
    fun getBatteryLife() :Double{
        return this.battery
    }

}

//Note: Any class inherits from Any class

fun main(args: Array<String>) {

    var tata = Car("Indica","TATA MOTORS")
    var tesla = Ecar("TeslaG6","TESLA MOTORS",4500.5)

    tata.drive(500.5)
    tesla.drive(300.56)
    tesla.extendRange(400.0)

    tesla.range = 2367.8

    //polymorphism
    tesla.drive()
    tesla.drive(888.876)

    println("Tesla battery life is of ${tesla.getBatteryLife()} KW")
}