package basics

fun main(){
    val firstCharOfName= 'C'
// val firstCharOfName1:Char='CA' Too many characters in a character literal 'CA'

    val charNumber:Char='6'

    val converted= charNumber.toInt()

    println("Char Number: "+charNumber) // 6
    println("Converted: "+converted)  // 54

    val charT= '\t'
    val charN='\n'
    val charB='\b'
    val charR='\r'
    val char1='\''
    val char2='\"'
    val charSlash='\\'
    val charDolar='\$'

    val name="Cenker Aydın "+charT+
            "CharN "+charN+
            "Cenker Aydın "+charB+
            "Cenker Aydın "+charR
    println(name)

    val uniCode='\uFF00'
    println(uniCode)




}


