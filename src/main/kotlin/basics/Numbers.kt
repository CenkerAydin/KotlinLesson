package basics

fun main(){

    val byte:Byte=19
    println(byte)

    val short:Short=128
    println(short)

    val int=3
    println(int)

    val long=3L
    println(long)

    val float=19.9F
    println(float)

    val double=3.14
    println(double)

    val number =10000 //int
    println(number===number) // true

    val boxedNumber:Int? =number
    val boxedNumber1: Int? =number
    println(boxedNumber===boxedNumber1)//Referans tipli değişken olur ve adresi kontrol eder //false
    println(boxedNumber==boxedNumber1) //true valuelerını kontrol ediyor

    //Type Conversion

    val uniId=125.toByte()
    val converted:Short=uniId.toShort()

    println("UniId: "+uniId)
    println("ConvertedShort: "+converted)

    val bytee:String= "1"
    val intConver= Integer.parseInt(bytee)


}