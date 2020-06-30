package com.example.helloworld

fun main() {

    //val is immutable variable : val cannot be changed
    val piValue = 3.142//value of identifier will not change at run time
    var name = "Roshan" //value of identifier can be  changed at run time
    name = "Roshan Raut"
    println("Value of PI is " + piValue)
    print("My name is " + "$name")


    //Data types
    val myName = "Roshan"
    //type int 32 bit
    var myAge: Int
    myAge = 21

    val small: Int
    small = 233
    //Integer Types: Bytes (8 bits), Short (16 bit),Int (32 bit),Long (64 bits)

    val byteVal: Byte = 125
    val shortVal: Short = 125
    val intVal: Int = 1234444
    val longVal: Long = 123_456_789_123_455

    //Floating Point number Types : Float (32 bit), Double(64 bit)
    //val floatVal: Float = 123.4555//Error
    val floatVal: Float = 123.4555f//default float type of double unless specified f,F
    val doubleVal: Double = 12.3445566789923

    //Boolean datatype:They represent the logical values either true or false
    var isHonest: Boolean = false
    isHonest = true;
    println("\nBoolean value : " + isHonest)

    //Characters
    val letterChar = 'A'
    val symbol = '#'

    //String
    val myStr = "Hello Kotlin"
    var firstChar = myStr[0]
    var lastChar = myStr[myStr.length - 1]

    println("First char of string : " + firstChar)
    println("Last char of string : " + lastChar)


    /*
    Exercise Variables And Datatypes
Please write a program in which you are assigning those values to variables with the right (specific) data type:
"Android Masterclass"

13.37F

3.14159265358979

25

2020

18881234567

true

'a'
NOTE:
Please don't simply use Kotlin's powerful type inference feature for this.

For example, write

var age : Short = 25

and not

var age = 25

even though both are correct. This is just for testing your understanding of the different basic data types.
All of them should be "var", except for the pi value and 13.37, use "val" here.
Try to use descriptive and useful names


ansCode :
var stringVal : String = "Android Masterclass"
val floatVal : Float = 13.37F
val doubleVal : Double = 3.14159265358979
val byteVal : Byte = 25
val intVal : Int = 2020
val longVal : Long = 18881234567
val boolVal : Boolean = true
val charVal : Char = 'a'
     */

    //Arithmetic operators(+,-,*,/,%)
    var a: Int = 3
    var b: Int = 4
    println("a+b = " + (a + b))
    println("a-b = " + (a - b))
    println("a*b = " + (a * b))
    println("a/b = " + (a / b))
    println("a%b = " + (a % b))

    var resultDouble: Double
    resultDouble = a / b.toDouble()
    println("a / b.toDouble() = " + resultDouble)
    var resultInt: Int
    resultInt = a / b
    println("a/b = " + resultInt)
    var resultFloat: Float
    resultFloat = a.toFloat() / b
    println("a.toFloat()/b = $resultFloat")

    //Comparson Operators (==,!=,<,>,<=,>=)
    val isEqual = 3 == 4
    println("3==4 is $isEqual")
    val isNotEqual: Boolean = 3 != 4
    println("3!=4 is $isNotEqual")
    val isLessThan: Boolean = 3 < 4
    println("3 < 4 is $isLessThan")
    val isGreaterThan: Boolean = 3 > 4
    println("3 > 4 is ${3 > 4}")
    val isLessThanEqual: Boolean = 3 <= 4
    println("3 <= 4 is ${3 <= 4}")
    val isGreaterThanEqual: Boolean = 3 >= 4
    println("3 >= 4 is ${3 >= 4}")


    //assignment operators (+= , -= , *= ,/= ,%=)
    var num: Int = 0
    num += 5
    println("num += 5 " + num)
    num -= 1
    println("num -= 1 " + num)
    num *= 3
    println("num *= 3 " + num)
    num /= 3
    println("num /= 3 " + num)
    num %= 35
    println("num %= 35 " + num)

    //Increment /Decrement Operators
    println("num = $num")//4
    println("num++ = ${num++}")//4
    println("++num = ${++num}")//6
    println("num = ${num}")//6
    println("num-- = ${num--}")//6
    println("--num = ${--num}")//4

    //if else statements
    var age: Int = 24
    if (age > 21) {
        println("You can Marry")
    } else if (age >= 18) {
        println("You can vote")
    } else if (age > 16) {
        println("You can drive ")
    } else {
        println("You are too young")
    }

    val guestName: String = "Roshan"
    if (guestName == "Roshan") {
        println("Hello ! $guestName");
    } else {
        println("Who are you,men ?")
    }

    //When statements replacement for switch statments
    var case: Int = 3
    when (case) {
        1 -> {
            println("Case 1")
        }
        2 -> {
            println("Case 2")
        }
        3 -> {
            println("Case 3")
        }
        else -> {
            println("INVALID CASE ")
        }
    }

    age = 17
    when (age) {
        !in 0..20 -> {
            println("You can marry")
        }
        in 18..20 -> {
            println("You can Vote")
        }
        in 16..17 -> {
            println("You can drive")
        }
        in 1 downTo 15 -> {
            println("You are too young")
        }
        else -> {
            println(" INVALID AGE ")
        }
    }

    var month: Int = 5

    when (month) {
        1, 2, 3, 4 -> {
            println("Jan to April")
        }
        in 5..8 -> {
            println("May to August")
        }
        in 9..12 -> {
            println("September to December")
        }
        !in 1..12 -> {
            println("Invalid Month of Year")
        }
    }

    var x: Any = 23.455F//Any means Object datatype
    when (x) {
        is Int -> println("$x is an Int")
        is Float -> println("$x is a Float")
        !is Boolean -> println("$x is not a Boolean")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above data types in Kotlin")
    }

    //Loops (for ,while ,do ... while)
    var i = 100
    println("WHILE loop : ")
    println("The Even values btw 1 to 100 are : ")
    while (i > 0) {
        print("$i ")
        i -= 2
    }

    var state: String = "hot"
    var temp: Int = 99
    while (state != "Cold") {

        if (temp == 25) {
            state = "Cold"
            println("Now the temperature is $temp degree celcius Cold State")
        }
        temp--
    }

    //do while loop gets executed atleast once
    i = 1
    println("Do while loop : ")
    println("The Odd value btw 1 to 10 are :")
    do {
        print("$i ")
        i += 2
    } while (i < 10)

    println("\nfor loop in range 1 to 10 : ")
    for(num in 1..10){
        print("$num ")
    }

    println("\nfor loop util 1 to 9 excluding 10 : ")
    for(i in 1 until 10){
        print("$i ")
    }

    println("\nfor loop using until 1 to 9 excluding 10 : ")
    for(i in 1.until(10)){
        print("$i ")
    }

    println("\nfor loop using 10 downTo 1 : ")
    for(i in 10 downTo 1){
        print("$i ")
    }
    println("\nfor loop using 10.downTo(1) : ")
    for(i in 10.downTo(1)){
        print("$i ")
    }

    println("\nfor loop using step of 3 : ")
    for(i in 10.downTo(1).step(3)){
        print("$i ")
    }


    println("\nfor loop using step of 5 : ")
    for(i in 10.downTo(1) step 5){
        print("$i ")
    }

    println("\n for loop using step of 2 : ")
    for (i in 0..10 step 2){
        print("$i ")
    }

    /*
    Exercise Loops
Write a for loop that runs from 0 to 10000
Once it's at 9001 it should write "IT'S OVER 9000!!!"

Write a while loop that checks the humidity (not the humidityLevel). The variable humidityLevel starts at 80. The variable humidity is initialized with "humid". If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"

     */
    //soltuion :
    for (i in 0..10000){
        if(i == 9001){
            println("\nIT'S OVER 9000!!!")
        }
    }

    var humidity : String = "humid"
    var humidityLevel : Int = 80
    while(humidity == "humid"){
        humidityLevel -= 5
        println("humidity decreased by 5")
        if(humidityLevel < 60){
            println("it's comfy now")
            humidity = "comfy"
        }
    }

    //functions and methods
    println("Add function : "+add(3,5))//arguments are values passed to a function
    //methods are function in objects oriented concepts.
    //methods is a function within a class
    //Kotlin donot have procedures but procedures are the fucntion with no return types.
    /*
    In Kotlin there are no procedures, because every function returns at least Unit
     object. Note that direct analogue of printUser procedure is a function
      in Kotlin, because it returns Unit:
     */
    println("Average of two num's : "+ avg(5.3,13.3))

    //Nullables/Optionals in Kotlin : a Billion dollar mistake
    //Nullable are introduced to reduce the amount of null pointer exceptions in Kotlin

    var nikName :String = "ROSHAN"
    //nikName = null //Error : Compilation Error
    var nullableNikName : String? = "ROSHAN" //?represents that the variable is nullable
    nullableNikName = null

    var len1 = nikName.length
    //var len2 = nullabkeNikName.length//Compilation Error

    //solution 1
//    if(nullableNikName != null){
//        var len2 = nullableNikName.length
//    }else{
//        null
//    }
    //solution 2
    var len2 = nullableNikName?.length//valid using ?. safe operators
    //println(nullableNikName?.toLowerCase())
    nullableNikName?.let { println(it.length) }

    //?: Elvis operator = it assigns a value if the var is null
    var nulVal : String? = "Roshan"
    val name1 = nulVal ?: "Shubham"
    println("name is $nulVal")
    val nulVal3 : String? = null

    //!! is a null insertion operator
    nulVal3!!.toLowerCase()//Results in NullPointer Exception

}

//parameters are the variables inside the function
fun add(num1 : Int,num2 : Int ) : Int{
    return num1 + num2
}

fun avg(num1 : Double,num2 : Double) : Double{
    return ( num1 + num2 )/2
}