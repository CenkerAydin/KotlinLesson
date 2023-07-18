package Classes

open class Foo(){

    private val name="Cenker"

    public  var surname="Aydın"

    internal val age=21

    protected  val email="cenkeraydin14@gmail.com"

    fun printName(){
        println("Merhaba $name")
        println("Surname $surname")
        println("Email: $email")
    }
    fun getName():String{
        return name
    }
}

class Boo private constructor():Foo(){
    init {
        //name erişilemez.
        surname
        age
        email
    }
}

class Doo(){
    init {
        val foo=Foo()
        //foo.name
        foo.surname
        foo.age
       // foo.email
    }
}
fun main(){
    val foo=Foo()
    foo.surname ="ayd"
    foo.getName()

}