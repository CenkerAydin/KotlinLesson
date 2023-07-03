package ControlFlow

import java.util.*

fun main() {

    val country= readLine()!!

    when(country.lowercase(Locale.getDefault())){
        "tr","az" -> println("Türk")
        "ar" -> println("Arap")
        "fr" -> println("Fransız")
        "ru" -> println("Rus")
    }

   when(country.toInt()){
       3.and(5) -> println("TC")
       1 or 2 -> println("UK")
   }

    when{
        country.lowercase(Locale.getDefault()) =="tr" && country.lowercase(Locale.getDefault()) =="az" -> println("TC")
        country.lowercase(Locale.getDefault()) =="ar" -> println("Arap")
        country.lowercase(Locale.getDefault()) =="fr" -> println("Fransız")
        country.lowercase(Locale.getDefault()) =="ru" -> println("Rus")
        country.lowercase(Locale.getDefault()) =="uk" -> println("UK")
    }

    val tr="tr"
    val ar="ar"
    val fr="fr"
    val ru="ru"
    val uk="uk"
    when(country.lowercase(Locale.getDefault())){
        tr , "az" -> println("TC")
        ar -> println("Arap")
        fr -> println("Fransız")
        ru -> println("Rus")
        uk -> println("UK")
    }

    val phone=5345456765L
    when(phone){
        else -> {
            println("Long value")
        }
    }

    val num=3
    when(num){
        in 0..10 ->{
            println("Number between 0 and 10 value")
        }
        in 11..20 ->{
            println("Number between 11 and 20 value")
        }
        !in 11..20 ->{
            println("Not Between 11 and 20")
        }
    }
}