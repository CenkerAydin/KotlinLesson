package Classes



class Outer{
    private val name="Cenker"
    val surName="Aydın"
    fun getAge():Int =21
    class NestedClass{
        fun printName(){
          //  name
           // surName
           // getAge()
        }
    }
}

interface OuterInterface{

    class DenemeA
    interface NestedInterface
}

class Outer2{
        private val name="Cenker"
        val surName="Aydın"

    fun getAge():Int =21
    inner class InnerClass{
        fun printName(){
            name
            surName
            getAge()
        }
    }
}

fun main() {
    val outer=Outer()
    outer.getAge()
    outer.surName

    Outer.NestedClass().printName()
    //Outer.NestedClass().printName(outer) memory leak oluşturur
    // Outer().NestedClass().printName

    Outer2().InnerClass().printName()
}