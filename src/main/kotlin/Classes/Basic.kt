package Classes



class Car(wheelCount:Int, color:String) {
    private val mWheelCount: Int
    private val mColor = color

    init {
        mWheelCount = wheelCount
        "primary const. created".printLog()
        "WheelCount: $mWheelCount, Color: $mColor".printLog()
    }
    constructor(name:String):this(4,"red"){
        "1. secondary const. created".printLog()
    }
    constructor(name: String, madeOf: String) : this(4,"blue") {
        "2. secondary const. created".printLog()
    }


}

fun main() {
    val car0=Car(4,"Black")
    val car1=Car(4,"Blue")
    val car2=Car("Mini Cooper")
    val car3=Car("Mini Cooper","Metal")
}

fun String.printLog(){
    println(this)
    println("-------------")
}