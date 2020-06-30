package com.example.helloworld
var b = 45
fun main(){
    myFun(5)
    println("The value of b = $b ")//54    
}

fun myFun(a : Int){
    var a : Int = a //Note : Kotlin allows us to declare the same var and parameter name 
    var b = 4
    println("value of b = $b")//4
}
