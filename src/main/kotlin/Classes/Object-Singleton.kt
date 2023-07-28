package Classes

object SingletonKotlin{
    var nickName:String? =null
    var counter:Int=0
}

fun main() {
    SingletonKotlin.nickName="Cenker"
    SingletonKotlin.counter++
    SingletonKotlin.counter++
    SingletonKotlin.counter++
    SingletonKotlin.counter++

    println(SingletonKotlin.counter)

}