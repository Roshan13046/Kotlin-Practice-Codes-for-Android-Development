package com.example.helloworld

//ArrayLists are used to create a dynamic array .Which means the size of an ArrayList can be increased or decreased according to your requirement.
//it's class provides both read and write functionalities
//it follows the sequence of insertion order.
//An ArrayList is non synchronized and it may contain duplicate elements

//Constructors of arrayList
//ArrayList<dataType>()   : Is used to create an empty ArrayList
//ArrayList<dataType>(capacity:Int) : Is used to create an ArrayList of specified capacity
//ArrayList(elements: Collection<dataType>):Used to create an ArrayList filled with the elements of a collection.

fun main(args: Array<String>) {
    var roshan :ArrayList<String> = ArrayList<String>()
    //functions of ArrayList
    //open fun add(element:E):Boolean -> to add specific element to collection
    roshan.add("1_2ka4")
    roshan.add("ramaTheSaviour")
    //open fun clear() -> used to remove all elements

    //open fun get(index:Int):E -> to get element at certain index
    println(roshan.get(1))
    //open fun remove():Boolean -> used to remove a single instance of the specific element from currrent collection , if it is available
    println("remove element at index 0 ${roshan.removeAt(0)} successfully")
    roshan.add("ramTheSaviour")
    roshan.add("roshan_raut")
    roshan.add("kabir_singh")
    for (i in roshan){
        print("$i ")
    }
    println()

    var list : MutableList<String> = mutableListOf<String>()

    list.add("kitkat")
    list.add("Oreo")
    list.add("Jellybeans")

    roshan.addAll(list)
    println("roshan list has size = "+roshan.size)
    for(i in roshan){
        print("$i ")
    }
    println("")
    //iterating in arrrayList
    val itr = roshan.iterator()
    while(itr.hasNext()){
        print("${itr.next()} ")
    }

    println()

}

//Challenge Exercise
/*

//Exercise ArrayList
//Please write a program that adds five Numbers (Double) to an arrayList and then calculates the average of those numbers. Please use a for (in) loop in this exercise.

fun main(args: Array<String>) {
    var roshanList : ArrayList<Double> = ArrayList<Double> ()
    for(i in 1..5){
        roshanList.add(i+0.00)
    }

    var sum : Double = 0.0
    var itr = roshanList.iterator()
    while(itr.hasNext()){
        sum += itr.next()
    }

    println("Average of roshanList Elements is = ${sum/roshanList.size}")
}

 */