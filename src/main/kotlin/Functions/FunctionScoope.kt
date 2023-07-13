package Functions

fun main() {

    calculateAtomPhysics()
}

fun calculateAtomPhysics(){
    val userName="Cenker"
    println("Initialize Process...")


    fun getValuesFromUserAndPrint(){
        userName.length
        val numberOne= readLine()!!.toInt()
        val numberTwo= readLine()!!.toInt()
        val res=numberOne+numberTwo
        println("$res")
    }

    getValuesFromUserAndPrint()
    println("Process has been done")
}

class Car{
    fun setColor(colorCodeId:Int){

    }
}

fun <T> setColor(colorCodeId: T){

}