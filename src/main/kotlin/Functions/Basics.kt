package Functions

//val name:String ="Cenker"
//fun name:String ="Cenker"
//fun name(val surName:String="Cenker"):String ="Cenker"

fun main() {
    // takeCube(2) Böyle tanımlanırsa dönme tipinin unit olması lazım
    //Eğer bir geri dönüşü varsa bir değişkene atanabilir

    val squareValue2 = takeCube(2)
    println(squareValue2)
    val squareValue3 = takeCube(3)
    println(squareValue3)
    val squareValue4 = takeCube(4)
    println(squareValue4)
    val squareValue5 = takeCube(5)
    println(squareValue5)

    Math.pow(2.0, 3.0)

    reformatMessage("Message", true, 7, "tr")
    reformatMessage(message = "Message", size = 7, lang = "tr")
    reformatMessage("Message", true, 7)
    reformatMessage("Message", size = 7)


    //vararg kullanımına örnek ,key=3'den önceki parametreler vararg parametresine denk gelir.
    getUserInfo("Cenker", "Aydın", "Istanbul", "Türkiye", "", key = 3)
    getUserInfo2(key = 2, "Cenker", "Aydın", "Istanbul", "Türkiye")

    getUserInfo3(3, "cenk", true, 3.14, 87)
}

fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
    println("Message :$message isUppercasse: $isUpperCase Size: $size lang: $lang")
}

@JvmOverloads
fun printss(message: String = "Message",size:Int=0) {
    println(message)
}

fun boo() {
    printss()
    printss("asfkmasf")
    printss(size=4)
    printss("asd",size=5)
}

fun takeCube(number: Int): Int {
    fun takeSquare(number: Int): Int {
        return number * number
    }
    return takeSquare(number) * number
}

fun getUserInfo(vararg userInfo: String, key: Int) {
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(vararg userInfo: String) {

}

fun getUserInfo2(key: Int, vararg userInfo: String) {

}

fun getUserInfo3(vararg userInfo: Any) {

}

val userList = arrayOfNulls<String>(5)
fun getListCount(): Int = userList.size
fun getListCount2(): Int {
    return userList.size
}