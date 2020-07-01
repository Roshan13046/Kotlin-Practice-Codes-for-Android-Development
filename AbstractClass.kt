package com.example.helloworld
package com.example.helloworld

//An abstract class similar to interface with the properties that it can have constructors and fields

//An abstract class cannot be instantiated
//(we cannot create instance of an abstract class)
//However,we can abstract subclass derived from an abstarct class ie we can use abstract class in inheritance
//The members (properties and methods ) of an abstract class are non-abstract unless they are given abstract keyword


//main difference btw interface and abstract class.
//interface can be multiple but abstract class can be one .
//abstract class can have constructor but interface cannot .
//abstract class can have fields but interface canot have fields
abstract class Mammal (private val name : String ,private val origin:String,private val weight:Double){//Concrete (Non Abstract) Properties
//var eyes : Int = 2 //this is a field
//Abstract property (Must be overriden by subclass)
abstract var maxSpeed : Double

    //Abstract Methods (Must be overriden by subclass)
    abstract fun run()
    abstract fun breath()

    //Concrete (Non abstract ) Method
    fun displayDetails(){
        println("Name : $name, Origin: $origin , Weight: $weight, Max Speed : $maxSpeed")
    }
}

class Human(name:String ,origin:String,weight:Double,override var maxSpeed:Double) : Mammal(name,origin,weight){
    override fun run(){
        //code to run
        println("Run on two legs")
    }
    override fun breath(){
        //code to breath
        println("Breath through mouth or nose both")
    }
}


class Elephant (name :String ,origin:String,weight:Double,override var maxSpeed:Double):Mammal(name,origin,weight){

    override fun run(){
        println(" Runs on four legs and has tail ")
    }
    override fun breath(){
        println("Breath through the trunk")
    }
}

fun main(){
    val human = Human("Roshan","India",72.45,40.8)
    val elephant = Elephant("Rani","West Bengal",45699.56,20.76)
    //val mammal = Mammal("mammaual","Erusia",99999.89)//ERROR : cannot create instance of abstract class
    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}