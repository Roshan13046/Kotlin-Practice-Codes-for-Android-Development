package com.example.helloworld

//outer class can access nested class members
// //nested class is bydefault static

// class OuterClass{
//     private var name : String = "MR.Roshan"
//     class NestedClass{
//         var likesToDo : String = "Coding inside nested class"
//         private var id : Int = 101
//         fun nestedFun(){
//          //   println("name is ${name}")//cannot access the outer class memeber
//             println("${likesToDo} and is is ${id}")
//         }
//     }
// }

// fun main(args:Array<String>){
//     var outer =  OuterClass.NestedClass()//object fun
// println("${OuterClass.NestedClass().likesToDo}")
//     outer.nestedFun()//accessible
// }

//Inner class is a class which is created inside another class with keyword inner
//In other words,we can say that a nested class is marked as "inner" is called inner class
//Inner class canno be declaed inside interfaces or non-inner class

//Main advantage of inner class over nested class is that , it is able to access members of it's outer class even it is private

//eg of inner class
class OuterClass{
    private var name : String = "MR.Roshan"

    private fun funOfOuter() : Int{
        println("Outer class fun called")

        return 1
    }
    inner class NestedClass{
        var likesToDo : String = "Coding inside nested class"
        private var id : Int = 101

        fun innerFun(){
            println("private var of outer class can be accessed name is ${name}")//can access the outer class memeber even private members
            println("${likesToDo} and is is ${id}")

            println("inner class can acces private fun of outer class ${funOfOuter()}")
        }
    }
}

fun main(args:Array<String>){
    var outerObj = OuterClass().NestedClass()//note syntax change comapred to nested class
    outerObj.innerFun()

    println("can access inner class member: ${OuterClass().NestedClass().likesToDo}")


}