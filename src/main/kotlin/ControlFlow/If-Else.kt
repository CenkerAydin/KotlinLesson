package ControlFlow

fun main() {

    print("Are you a student?")
    val answer= readLine()!!

    //State
    if(answer.contains("Yes",ignoreCase = false)){
        println("Student")
    }else{
        println("Not student")
    }

    //Expression
    val res:String=if (answer=="Yes"){
        "Student"
    }else{
        "Not Student"
    }
    println(res)

   // if (10==10L){ } //Operator '==' cannot be applied to 'Int' and 'Long'

    if (10.toLong() ==10L){
        //bu kod bloğu çalışır.
    }
}