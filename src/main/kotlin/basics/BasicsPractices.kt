package basics

import java.time.LocalDateTime
import java.util.Scanner

fun main() {
    val number1=12
    val number2=18
    println("Sum: "+number1.plus(number2))
    println()

    val firstName="Cenker"
    val lastName="Aydın"
    val fullName=firstName+" "+lastName
    println("Full Name: $fullName")
    println("Full Name Lenght: ${fullName.length}")
    println("First Char of name: ${fullName[0]}")
    println("Last Char of name: ${fullName[fullName.length-1]}")
    println()

    var count=5
    println("Number: $count")
    count=19
    println("New Number: $count")
    println()

    print("Enter the char:")
    val char= readLine()
    println("$char")

    val isRaining=true
    val isSunny=false
    if (isSunny){
        println("It's sunny!")
    }else if (isRaining){
        println("It's raining.")
    }else{
        println("No information  of weather.")
    }
    println()


    val current=LocalDateTime.now()
    println("Current Date: $current")
    println()

    val floatNum=1.5f
    val floatNum2=4.0f
    println("Multiply: ${floatNum.times(floatNum2)}")

    val charA='A'
    val charAscii= charA.code //charA.toInt()
    println("ASCII value of $charA is: $charAscii")
    println()


    val x=30
    val y=7
    val quatient= x/y
    val remainder= x%y
    println("Quatient= $quatient")
    println("Remainder= $remainder")
    println()

    var first=1.56f
    var second=3.56f
    println("Before Swap")
    println("First Number: $first \nSecond Number: $second")
    val temporary=first
    first=second
    second=temporary
    println("After Swap \nFirst Number: $first \nSecond Number: $second")
    println()

    val reader=Scanner(System.`in`)
    print("Enter the number")
    val number= reader.nextInt()
    if (number % 2 == 0){
        println("$number is even")
    }else
        println("$number is odd")


}