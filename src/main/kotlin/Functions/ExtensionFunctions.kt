package Functions

fun main() {
        val pi:Double=3 +0.14
        println(pi)

        val schoolNum:Int=1466
        println(schoolNum)

        val tcNum:Long=12345678910
        println(tcNum)
        println()

        log2(pi)
        log2(schoolNum)
        log2(tcNum)
        println()

    (3+0.14).log("")
    1466.log("")
    1466.toFloat()
    12345678910.log("")

    (3 +0.14) log ""

    pi.log("")
    schoolNum.log("")
    tcNum.log("")

    //extPlus infix extension olduğu için . kullanımına ihtiyaç duymaz.
    ("3" extPlus "5").log("")


    

}

fun log2(number:Number){
    println(number)
}

//Number(reciever) sınıfına extension olarak yazılmış log fonksiyonu.Aynı zamanda infix yapılmıştır.
//this ifadesi, extension yapılan değeri verir.3 log "4" yaparsanız
//aşağıdaki kod size emptyParam="4",this= 3 olarak verilir.
infix fun Number.log(emptyParam:String){
    println(emptyParam+this)
}

infix fun String.extPlus(otherString:String):Int=this.toInt()+ otherString.toInt()

open class Shape{
    var intNum=0
    fun setNumber(intNum:Int){
        this.intNum=intNum
    }
    fun main(){
        intNum.extToString()
        intNum.log("")
    }
    open fun Int.extToString(){
        println("")

        //Int.extToString() methodunu işaret eder.
        extToString()
        this.extToString()

        //Shape'e ait aşağıdaki üye methodu işaret eder.
        this@Shape.extToString()

        println("Awesome class printi")
    }
    fun extToString(){
        println("Keko class printi")
    }
}

fun Shape.setNumber(intNum: Int){
    val res=intNum*intNum
    println(res)
}

class AShape():Shape(){
        fun deneme(){
            4.extToString()
        }
}

var Shape.type
    get() = "Rectangle"
    set(value)  {
        type = value
    }

class Rectangle:Shape(){
    override fun Int.extToString() {

    }
}