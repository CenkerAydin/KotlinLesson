package basics

fun main() {
    val name="CENK"
    val char1='C'
    val char2='E'
    val char3='N'
    val char4='K'
    val nameArray= charArrayOf(char1,char2,char3,char4)

    for (char in name){
        println(char)
    }
    val awesome ="Cenk is Awesome"
    val firstAwesome =awesome[awesome.indices.first]
    println(firstAwesome)
    val lastAwesome=awesome[awesome.indices.last]
    println(lastAwesome)

    val number:String="Value"+(4+2+8)
   // val numbersValue:String=(4)+"value" //Çalışmaz,hata verir.

    println(number)

    println("numbers Value $number") //String template
    println("numbers Value Length: ${number.length}")

    val rawPineTree="""
              **
             ***
            ****
    """.trimIndent()

    println(rawPineTree)

}