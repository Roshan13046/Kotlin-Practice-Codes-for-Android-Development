package com.example.helloworld


fun main(args: Array<String>){
    var roshan = Person("Roshan","Raut")
}
class Person constructor(_firstName: String, _lastName: String) { // or class Person constructor    (_firstName: String, _lastName: String)
    // Member Variables (Properties) of the class
    var firstName: String
    var lastName: String

    // Initializer Block
    init {
        this.firstName = _firstName
        this.lastName = _lastName

        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// create an object like so:
// val denis = Person("Denis", "Panjuta")

// Alternatively:
class Person (_firstName: String, _lastName: String) {
    // Member Variables (Properties) of the class
    var firstName: String = _firstName
    var lastName: String = _lastName

    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Alternatively:
class Person(var firstName: String, var lastName: String) {
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Or even:
// whereby John and Doe will be default values
class Person(var firstName: String = "John", var lastName: String= "Doe") {
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Create an object:
/*
    val john = Person()
    val johnPeterson = Person(lastname: "Peterson")

*/

class Person(var firstName: String, var lastName: String) {
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var myFirstName = firstName

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    fun stateHobby(){
        println("$firstname \'s Hobby is: $hobby'" )
    }
}

// You can use primary or secondary Constructor to create an object

// Calls the primary constructor (Age will be null in this case)
val person1 = Person("Denis", "Panjuta")

// Calls the secondary constructor
val person2 = Person("Elon", "Musk", 48)



// Having multiple overloads:

class Person(var firstName: String, var lastName: String) {
    var age: Int? = null
    var eyeColor: String? = null

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int, eyeColor: String):
            this(firstName, lastName, age)  {
        this.eyeColor = eyeColor
    }
}



