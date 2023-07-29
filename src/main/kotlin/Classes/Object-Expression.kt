package Classes

interface Print2{
    fun onPrint()
}

open class User(val age:Int){
    open fun getUserFullName(){}
}

val fullName:User=object : Print2, User(23){
    val firstName="Cenker"
    val surName="Aydın"

    override fun onPrint() {
        println("Full Name = $firstName $surName")
    }

    override fun toString(): String {
        return "$firstName $surName"
    }
}