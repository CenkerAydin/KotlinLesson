package ControlFlow

fun main() {

    var num=10
    val num2=15

    println("Num: ${num}")
    println("Num: ${num++}")
    println("Num: ${num}")
    println("Num: ${++num}")

    print("${num+num2}")
    print(" ")
    println(num.plus(num2))

    print("${num-num2}")
    print(" ")
    println(num.minus(num2))

    print("${num*num2}")
    print(" ")
    println(num.times(num2))

    print("${num/num2}")
    print(" ")
    println(num.div(num2))

    print("${num%num2}")
    print(" ")
    println(num.rem(num2))

    println()

    print("Enter the final note")
    val grade= readLine()!!.toInt()
    val charNote=if (grade in 88..100){
        "$grade= AA"
    }else if(grade in 80..87){
        "$grade ==BA"
    }else if (grade in 73..79){
        "$grade==BB"
    }else if (grade in 65..72){
        "$grade==CB"
    }else {
        "$grade==CC"
    }

    println(grade.compareTo(80))

    var numA=-10
    var numB=6
    var bool=true
    println("-a: ${-numA}")
    println("-b: ${-numB}")
    println("++a: ${++numA}")
    println("a++:${numA++}")
    println("!bool: ${!bool}")
}