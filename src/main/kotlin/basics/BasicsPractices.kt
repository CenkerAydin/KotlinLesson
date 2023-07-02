package basics

import java.time.LocalDateTime
import java.util.Scanner

fun main() {
    //İki sayıyı toplama
    val number1=12
    val number2=18
    println("Sum: "+number1.plus(number2))
    println()

    //İki metini birleştirme
    val firstName="Cenker"
    val lastName="Aydın"
    val fullName=firstName+" "+lastName
    println("Full Name: $fullName")
    println("Full Name Lenght: ${fullName.length}")
    println("First Char of name: ${fullName[0]}")
    println("Last Char of name: ${fullName[fullName.length-1]}")
    println()

    //Sayıyı değiştirme
    var count=5
    println("Number: $count")
    count=19
    println("New Number: $count")
    println()

    //Kullanıcıdan char alma
    print("Enter the char:")
    val char= readLine()
    println("$char")

    //Boolean-if else
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

    //Local date
    val current=LocalDateTime.now()
    println("Current Date: $current")
    println()

    //Float sayıları çarpma
    val floatNum=1.5f
    val floatNum2=4.0f
    println("Multiply: ${floatNum.times(floatNum2)}")

    //Charın ascii değerini bulma.
    val charA='A'
    val charAscii= charA.code //charA.toInt()
    println("ASCII value of $charA is: $charAscii")
    println()

    //Mod ve kalan bulma
    val x=30
    val y=7
    val quatient= x/y
    val remainder= x%y
    println("Quatient= $quatient")
    println("Remainder= $remainder")
    println()

    //Sayıları değiştirme.
    var first=1.56f
    var second=3.56f
    println("Before Swap")
    println("First Number: $first \nSecond Number: $second")
    val temporary=first
    first=second
    second=temporary
    println("After Swap \nFirst Number: $first \nSecond Number: $second")
    println()

    //Kullanıcıdan değer alıp tek mi çift mi sorgusu
    val reader=Scanner(System.`in`)
    print("Enter the number: ")
    val number= reader.nextInt()
    if (number % 2 == 0){
        println("$number is even")
    }else
        println("$number is odd")

    //Sesli sessiz harf sorgu
    val ch='a'
    if (ch =='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u') println("Vowel")
    else println("Consonant")


}