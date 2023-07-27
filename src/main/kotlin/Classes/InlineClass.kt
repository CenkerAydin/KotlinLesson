package Classes

val balance:Int=25000

open class BankAccount2(val balance:Int, val accountNumber:Long){
    val branchCode=3245
}

interface Print{
    fun printBalance()
}

@JvmInline
value class BankAccount3(val balance:Int):Print{
    init {
        print("Balance: $balance")
    }
   // val accountNumber2:Long=123424124 -> Value class cannot have properties with backing fields

    val accountNumber:Long
        get() {
            return 1234563124
        }

    fun getAccountNumber2():Long{
        return 1234563124
    }

    override fun printBalance() {
        print("Interface print - balance: $balance")
    }
}

interface I

@JvmInline
value class Foo2(val i:Int):I
    fun asInline(f: Foo2){}
    fun <T> asGeneric(x:T){}
    fun asInterface(i:I){}
    fun asNullable(i: Foo2?){}

    fun <T> id(x:T):T=x

fun main() {
    val balance2:BankAccount2=BankAccount2(25000,123235) //Referans(class Nesnesi) tipli değişken
    val balance3:BankAccount3=BankAccount3(25000) //Referans tipli değişken değil.Primitive tip oluyor. Kapladığı yer az.
    val balance4:Int=25000 //balance 3 ile balance 4 aynı.

    val f =Foo2(42) //f'in tipi int -> primitive ->unboxed

    asInline(f) //Unboxed: used as Foo2 itself
    asGeneric(f) //boxed: used as generic type T
    asInterface(f) //boxed: used as type I
    asNullable(f) //boxed: used as Foo2?, which is different from Foo2
}