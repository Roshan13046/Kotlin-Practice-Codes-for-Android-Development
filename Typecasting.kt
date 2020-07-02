package com.example.helloworld

fun main(args:Array<String>){
    val stringList : List<String> = listOf("Roshan","Kabir","Shubham","Aditya")
    val mixedList : List<Any> = listOf("Roshan",123,23.33,123.34F,"Raut",23344444L)

    for(value in mixedList){
        if(value is String){
            println("$value is String of length = ${value.length}")
        }else if(value is Int){
            println("$value is Int")
        }else if(value is Double){
            println("$value is Double with floor value as ${Math.floor(value)}")
        }else if(value is Float){
            println("$value is Float")
        }else{
            println("$value is non of above Data - types")
        }
    }


//Safe Cast operator
var isString : Any = "Roshan"
    var safeString : String ?= isString as? String//  as? is SafeCast operator prevent exception crashing of app if isString is not String
    //it will set to null if isString is not a String
    var safeInt : Int?= isString as? Int
    println(safeString)//Roshan
    println(safeInt)//null





}
