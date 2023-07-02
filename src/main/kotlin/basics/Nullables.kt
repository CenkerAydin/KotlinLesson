package basics

fun main() {
    val name:String? =null
    val age:Int?=null

    val number =null //Nothing?

    var result:Int?=0
   // result.plus(324) //Only safe (?.) or non-null asserted (!!.)
    // calls are allowed on a nullable receiver of type Int?
    result!!.plus(324)
    result?.plus(32)
}