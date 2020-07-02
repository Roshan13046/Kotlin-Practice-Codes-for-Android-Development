package com.example.helloworld

//Lambda Expressions
//it is a function which has no name
//Lambda expressions and anonymous functions are function literals ir function that are not declared ,but passed immediately as an expression
//Lambda is defined with  curly braces {} which takes variables as a parameters (not required) and a body of a function

//The body of a function is written after the variables (if any) followed by -> operator.

//syntax: {variables(s) -> body_of_lambda}

fun main(args: Array<String>) {

    println("${add(3,4)}")
    println("${sum(3,4)}")
}

//normal add functon
fun add(a: Int,b:Int):Int{
    return a+b
}
//******************************************** More Lambda Examples       **************************************************************
//HighOrderFunctions: these are the functions which can take and return fun as a paramters using lambda functions or any other functions .
//lambda expression
val sum:(Int,Int)->Int={a:Int,b:Int -> a+b}
fun myFun(a:String,b:String,fn:(String,String)->Int):Unit{
    val result=fn(a,b)
    println("myFun called succesfully completed")
}

fun main(args:Array<String>){
    val fn:(String,String)->Int = { a,b->
        println("lambda called successfully")
        123
    }
    myFun("roshan","learning lambda function",fn)
    //can aslo write the lambda fun as
    myFun("roshan","another way of writing lambda function in highOrderFunctions",{a,b->println("lambda function called successfully") 123})
}


//************************** lambda code practice with highOrderFunctions




















