package com.example.helloworld

/*
dataClass must atleast have one parameter inside it's Primary constructor
it cannot be a abstract class,open ,seal or inner class
It is a basic class with no xtra overheads codes .
It is used to save time required  to write unnecessary xtra code for class .
 */

data class User(val id:Long ,var userName : String )

fun main(args:Array<String>){
    val user1 = User(1,"ramathesaviour")
    val name = user1.userName
    val id = user1.id

    user1.userName = "RoshanRaut"
    println("User1 Details : $user1")
    var user2 = User(1,"RoshanRaut")

    println("user1 == user2 ${user1 == user2}")//true

    val copyUser = user1.copy()
    println("copy User : ${copyUser}")

    val idUpdateUser = user1.copy(id = 28)//you can copy the entire user1 object with update id = 28
    println("No update in user1 ${user1}")
    println("Copy user1 details to idUpdateUser object with small update in id ${idUpdateUser}")
    val userNameUpdate = user1.copy(userName = "Roshan")
    println("Copy user1 details to idUpdateUser object with small update in userName ${userNameUpdate}")

    //print components of data class
    println(idUpdateUser.component1())//prints 28
    println(idUpdateUser.component2())//prints "RoshanRaut"

    val ( store_id,store_name) = userNameUpdate //can store the data members directly using this syntax

    println("$store_id , $store_name")



}