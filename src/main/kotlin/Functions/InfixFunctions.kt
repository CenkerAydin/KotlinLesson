package Functions

fun main() {

    val isStudent=false
    val isMale=true

    if(!isStudent and isMale){
        print("Öğrenci olmayan erkek")
    }

    isStudent and isMale //Infix kullanımı
    isStudent.and(isMale) //Infix olmayan kullanım

    val awesomeInstance =AwesomeClass()
    awesomeInstance downloadImage "www.google.com.tr"

}

class AwesomeClass{
    infix fun downloadImage(imageUrl:String){

    }
    infix fun specialPlus(number:Int):Int{
        return 4
    }

    fun logWhenImageDownload(imageUrl: String){
        downloadImage(imageUrl)
        // downloadImage imageUrl ->Hatalı kullanım.
        this downloadImage imageUrl //AwesomeClass() downloadImage imageUrl
    }
}

fun logWhenImageDownload(imageUrl: String){
    //this downloadImage imageUrl
}