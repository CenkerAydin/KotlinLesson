package Classes

data class User5(
    val name:String="Cenker",
    val surName:String="Aydın"
)

class CardDetailFragment{
    val user:User5 by lazy(){
        println("User5 Init")
        User5()
    }

    lateinit var user2:User5

    lateinit var userType:String

    fun printUserInfo(){
        println("Name: ${user.name}, surName: ${user.surName}")
        if (this::user2.isInitialized.not()){
            user2=User5()
        }
        println("Name: ${user2.name}, surName: ${user2.surName}")
    }
    init {
        userType="Premium"
    }
}

class BankAccount5(
    //val balanceChanged:BalanceChanged
inline val balanceChanged: (Long) -> Unit
){
    var balance:Long=1_000_000
    set(value) {
        field=value

    }
}

fun main() {
    val cardDetailFragment=CardDetailFragment()
    cardDetailFragment.printUserInfo()
    cardDetailFragment.printUserInfo()
}