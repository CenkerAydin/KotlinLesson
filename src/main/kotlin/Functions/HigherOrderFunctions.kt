package Functions

import java.util.Timer
import java.util.logging.Filter
import kotlin.concurrent.schedule


fun main() {

    val higherOrderFunction={ surname:String ->
        println("surname: $surname")
        "surname : $surname"
    }

    val anonymousFunction =fun(surname:String):String{
        return "surname: $surname"
    }

    val anonymousFunction2=fun(surname:String):String ="surname: $surname"

    //higher order function
    fun logPrint(message:String,count:Int):String{
        return "Log: $message"
    }
    fun foo(higherOrderFunction: (message:String,count:Int)->String){
        higherOrderFunction("Cenk",24)
    }
    foo(::logPrint)

    val news=News()
    news.read(::println)
   /* news.read({title ->
        print("asd")
    })
    */
    news.read{ title ->
        print(title)
    }
    news.read{ it-> print(it) }

    val titleFun=fun (title :String):Unit{
        print(title)
    }
    news.read(titleFun)

    printUserInfo(getName(),higherOrderFunction, getAge())
    printUserInfo(getName(),anonymousFunction, getAge())
    printUserInfo(getName(),fun(surName:String):String{
        return " surName: $surName"}, getAge())


    //Suslu parantezler(body) direkt olarak Higher Order Functionin parametre olarak beklendiği alana da yazılabilir
    printUserInfo(getName(),{it ->"surName: $it"}, getAge())

    val newsType =NewsType()
    news.getNewsFromServer("FoxTv",newsType){
        println(this.toString())
    }

    news.filterNews { filterType, getFilterName ->
        print("$filterType")
        getFilterName()
    }



}
//Normal fonksiyon
fun getName():String{
    return "Cenker"
}
//Normal fonksiyon,expression kullanımına örnek
fun getAge():Int=29

fun printUserInfo(name:String, getSurname:(surName:String) ->String ={surName -> ""},age:Int):Unit{
    println("Name: $name, age: $age")
    println(getSurname("Aydın"))
}

fun getItemClickListener(onClick:(String)->Unit){
    println("Tıklama işlemi başlatılıyor.")
    Timer().schedule(3000){

        onClick("Login")

        println("Tıklama işlemi bitti")
    }
}
class News{
        fun getNewsType(newsType:NewsType):String{
            return when(newsType.toString()){
                NewsType.breakingNews ->"Breaking"
                NewsType.urgent -> "Urgent"
                NewsType.local -> "Local"
                NewsType.global -> "Global"
                else ->"Normal"
            }
        }
}
class NewsType{
    companion object{
        val breakingNews="BrekingNews"
        val urgent ="Urgent"
        val local ="Local"
        val global ="Global"
        val normal="Normal"

    }
}

fun News.getNewsFromServer(channelType:String, newsType:NewsType, getNews: NewsType.(Int)-> Unit){
    when(channelType){
        "KanalD" -> {
            getNews(newsType,1)
        }
        "ShowTv" ->{
            getNews(newsType,2)
        }
        "Tv8" ->{
            getNews(newsType,3)
        }
        "FoxTv" ->{
            getNews(newsType,3)
        }
        "CNN" ->{
            getNews(newsType,3)
        }
    }
}

    //Bir higher Order Functionun parametresi yine Higher Order Function olabilir.
infix fun News.filterNews(getFilter: (filterType:String, getFilterName:()->String)->Unit){
    getFilter("filterName"){
        "String return label"
    }
}
infix fun News.read(readTitle: (title:String) ->Unit){
    readTitle("Codemy is Awesome")
}