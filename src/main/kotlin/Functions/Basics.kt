package Functions

//val name:String ="Cenker"
//fun name:String ="Cenker"
//fun name(val surName:String="Cenker"):String ="Cenker"

fun main(){

    val squareValue2= takeSquare(2)
    val squareValue3= takeSquare(3)
    val squareValue4= takeSquare(4)
    val squareValue5= takeSquare(5)

    Math.pow(2.0,3.0)

    reformatMessage("Message",true,7,"tr")
    reformatMessage(message="Message",size =7, lang="tr")
    reformatMessage("Message",true,7)
    reformatMessage("Message", size = 7)


    //vararg kullanımına örnek ,key=3'den önceki parametreler vararg parametresine denk gelir.
    getUserInfo("Cenker","Aydın","Istanbul","Türkiye","", key = 3)

    getUserInfo2(key=2,*arrayOf("Cenker","Aydın","Istanbul","Türkiye"))

    getUserInfo3(3,"cenk",true,3.14,87)

}
fun reformatMessage(message:String,isUpperCase:Boolean =false,size:Int,lang:String="tr"){
    println("Message :$message isUppercasse: $isUpperCase Size: $size lang: $lang")
}

fun takeSquare(number:Int):Int{
    return number*number
}

fun getUserInfo(vararg userInfo:String, key:Int){
    userInfo[3]
    userInfo.get(3)
}
fun getUserInfo2(vararg userInfo:String){

}
fun getUserInfo2(key:Int,vararg userInfo:String){

}
fun getUserInfo3(vararg  userInfo:Any){

}

val userList = arrayOfNulls<String>(5)
fun getListCount():Int = userList.size
fun getListCount2():Int{
    return userList.size
}