package Classes

class BankAccount{
    var balance=1_000_000
        set(value) {
            field =value // field = backing field
        }
    private  var dept=450000
}

fun main() {
    val bankAccount =BankAccount()
    println(bankAccount.balance)
    bankAccount.balance=500_000
    println(bankAccount.balance)


}