package Classes

open class Shape(val name:String){
    var mColor:String=""
    open var mEdgeCount:Int=0
    constructor(name: String, color: String) : this(name){
        mColor=color
    }

    constructor(name:String , color:String, edgeCount:Int): this(name){
        mColor=color
        mEdgeCount=edgeCount
    }

    open fun drawShape(){
        println("Name: $name")
        println("Color: $mColor")
        println("EdgeCount: $mEdgeCount")
    }

    fun calculateArea():Int =if (mEdgeCount !=0) {
        mEdgeCount * mEdgeCount
    }else{
        0
    }
}
class Rectangle(name:String): Shape(name){
        override var mEdgeCount:Int
        get() = super.mEdgeCount
        set(value) {}

    override fun drawShape() {
        drawShape()
        this.drawShape()
        super.drawShape()

        calculateArea()

        val rectangle = """"
            ************
            *          *
            *          *
            *          *  
            ************
        """.trimIndent()

        println(rectangle)
    }
}

class Circle(name:String, color:String) : Shape(name,color){
    override fun drawShape() {
        super.drawShape()

        val circle =""""
            ....
        """".trimIndent()

        println(circle)
    }
}

open class Square(name:String, color:String, edgeCount:Int) : Shape(name, color, edgeCount){
    final override fun drawShape() {
        super.drawShape()

        val square=""""
            ************
            *          *
            *          *
            ************
        """.trimIndent()
        println(square)

    }
}
class OneMeterSquare :Square("OneMeterSquare","Blue",4){
    /*override fun drawShape() {
        super.drawShape()
    } // -> Square classında final keywordu olduğu için square inherit alan classlarda drawShape override edilemez.

     */
}

fun main() {
    val shape =Shape("Shape")
    val rectangle=Rectangle("Rectangle")
    val circle=Circle("Circle","Magenta")
    val square=Square("Square","Cyan",4)

    shape.drawShape()
    rectangle.drawShape()
    circle.drawShape()
    square.drawShape()
}
