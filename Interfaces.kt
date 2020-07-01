package com.example.helloworld





//Iterface is a contract that a class if signs then that class has to implement it's properties and  functions

//Interfaces allows us to extend the functionality of classes
//Interfaces has some features of data variables and functions which need to be overriden in class implementing it.
//Use:
//Interface are useful when we have certains functions and properties that is not common to all objects of of that class

interface Drivable{
    val maxSpeed : Double //this var is not initialized so we have to initialize it in the class implementing it
    fun drive():String //this fun don't have body so the class implementing it will have to define this function to get it a body.
    fun brake(){
        println("Interface brake called")
    }
}


//Super class,Parent Class ,Base Class of Vehicle
open class Car( override val maxSpeed:Double ,val name:String , val brand:String) : Drivable{ //note: open keyword
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

    //implementing the drive function
    override fun drive():String{
        return "driving the interface drive in Car class"
    }

}

//child class,sub class, derived class


//Note: Subclass of a class that implements an Interface are also considered to be implementing the interface.
class Ecar(maxSpeed : Double ,name : String,brand:String ,batteryLife: Double ):Car(maxSpeed,name,brand){//note: Ecar must also include the variables of interface but no need to override it again in subclass bcz it is done by parent class already


    //Note: To override a data member or member function first make it open in parent class
    override var range  = batteryLife * 2


    //Some polymorhism concepts using overriding
    override fun drive(distance:Double){
        println("Drived the Electric car for $distance KM on electricity")
    }

    //implementing the drive funtion of  interface not neceessary
    override fun drive():String {
        return "The Range of Car is $range on electricity"
    }

    //can also override the brake funtion of interface
    override fun brake(){
        println("brake fun of Ecar Class called")
    }

}



fun main(args: Array<String>) {

    var tata = Car(500.00,"Indica","TATA MOTORS")
    var tesla = Ecar(450.0,"TeslaG6","TESLA MOTORS",4500.5)

    tata.drive(500.5)
    tesla.drive(300.56)
    tesla.extendRange(400.0)

    tesla.range = 2367.8

    //polymorphism
    tesla.drive()
    tesla.drive(888.876)

    println("TATA maxSpeed is ${tata.maxSpeed}")
    println("TESLA maxSpeed is ${tesla.maxSpeed}")

    tata.drive()
    tesla.drive()

    tata.brake()
    tesla.brake()


}