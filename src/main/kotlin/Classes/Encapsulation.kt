package Classes

val numberThree=3
open class Userr(){
     val numberEight= numberThree.plus(5)
    private val name="Cenker"
}

fun main() {
    val user=Userr()
}
 open class Class1{
    val publicVar: Int = 1
    internal val internalVar: Int = 2
    protected val protectedVar: Int = 3
    private val privateVar: Int = 4
}

class Class2:Class1()  {
    fun accessMembers() {
        // publicVar'a erişilebilir.
        val public=publicVar

        // internalVar'a erişilebilir.
        val internal = internalVar

        // protectedVar'a erişilebilir çünkü Class2, Class1'ın alt sınıfıdır.
        val protected = protectedVar

        // privateVar'a erişilemez.
       // val private = privateVar  // Hata verir.
    }
}