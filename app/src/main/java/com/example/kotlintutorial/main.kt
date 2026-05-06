package com.example.kotlintutorial
// Problem-1
/*fun main(){
    println("Hello World")
    var name:String = "Bariul"
    name= "Rakib"
    val age:Int= 25

    println(name)
    println(age)

}
*/
//Problem-2 python print("Hello World")

//problem-3 java
/*public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

*/

// variable & datatype
/*fun main(){
    val name: String = "Rahat" // নাম পাল্টাবে না
    var age: Int = 20          // বয়স পাল্টাতে পারে
    val gpa: Double = 3.85     // দশমিক সংখ্যা
    val isStudent: Boolean = true // হ্যাঁ অথবা না
    println(name)
    println(age)
    println(gpa)
    println(isStudent)
}*/

//Conditional If/Else
/*fun main(){
    val marks = 70

    if (marks >= 80) {
        println("You have gotten A+!")
    } else {
        println("You have to do more good")
    }
}*/

// loop
/*fun main(){
    for (i in 1..5) {
        println("roll number: $i")
    }
}
*/
// function of two number addition
/*fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result = addNumbers(10, 20) // ইনপুট দেওয়া হলো ১০ এবং ২০
    println("Addition of Two Number: $result")
}*/

// Learn Variable, loop, conditional
fun main() {
    val userName = "Abir" // Variable
    var balance = 500     // Variable

    println("Welcome $userName, Your Balance is $balance tk")

    // Using Loop 2times recharge
    for (i in 1..3) {
        balance += 10
        println("$i Balance After recharge: $balance")
    }

    // Conditional দিয়ে চেক করা
    if (balance > 700) {
        println("You have enough money")
    }else{println("you haven't much money")}

}