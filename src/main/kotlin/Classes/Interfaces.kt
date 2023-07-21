package Classes

interface  MyInterface {
    val prop:Int // Abstract

    val propertyWithImplementation:String
        get() = "Foo" //get methodu property olduğu için yapılır.Yani state tutmuyor.

    fun foo(){
        print(prop)
    }

    fun foo2()

    //abstract olabilir.
    abstract fun bar()
}

interface  Named{
  //  val fullName:String="242" ->Property initializers are not allowed in interfaces
    val fullName:String?

}
interface Person: Named{
    val firstName:String
    val lastName:String

    override val fullName: String?
        get() = "$firstName $lastName"
}



// abstract class Employee() : Person

class Employee:Person{
    override val firstName: String
        get() = TODO("Not yet implemented")
    override val lastName: String
        get() = TODO("Not yet implemented")
}

class Child(override val prop: Int):MyInterface {

    //override edilmesi zorunlu değildi.
    override val propertyWithImplementation: String
        get() = "Implemented Property"
    override fun foo2() {
        TODO("Not yet implemented")
    }
    override fun bar() {

    }
    //body'si olduğu için override edilme zorunluluğu yok.
    override fun foo(){
        super.foo()
    }
}
interface A{
    fun foo(){
        print("A")
    }
    fun bar()
}
interface B{
    fun foo(){
        print("B")
    }
    fun bar(){
        print("Bar")
    }
}
class C: A{
    override fun bar() {
        print("Bar")
    }
}

open class E(){

}
class D :E(), A,B{
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        //super<A>.bar() -> A interfaceinin bar fonksiyonunun bodysi yok o yuzden super ile erişilemez.
        super<B>.bar() // -> <B> arayuzunu yazmak zorunda kalmıyorsunuz.Buna redundant uyarısı verilir.
        super.bar()

    }


}

