package basics

fun main() {
    val numbers=1..10 //[1,10V]
    val numbers2=1.rangeTo(100).reversed() //100den 1 e kadar yazdırır.

    val char='A'..'Z'

    val reverseNumbers=100.downTo(1)

    val gradeNumbers=10.until(100) //[10,100)

    val steps=1..300 step 3

    val list:IntRange=10 until 90
    list.first
    list.step
    list.last
    list.endInclusive
    list.start

    list.count()

}