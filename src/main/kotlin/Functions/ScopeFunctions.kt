package Functions

import Classes.BankAccount3
import java.math.BigDecimal

fun main() {
    //Scope functions olmadan böyle yapıyoruz.
    var bankAccount: BankAccount? =null
     bankAccount = BankAccount(23432.32.toBigDecimal(),"Cenker")

    if ( bankAccount !=null && bankAccount.accountName !=null){
        println(bankAccount.accountName)
    }
    //scope functions kullanarak.
    bankAccount?.let {

        if ( bankAccount !=null && bankAccount.accountName !=null){
            println(bankAccount.accountName)
        }

        if ( it !=null && it.accountName !=null){
            println(bankAccount.accountName)
        }
    }

    bankAccount.run {
        if ( bankAccount !=null && bankAccount.accountName !=null){
            println(bankAccount.accountName)
        }

        if ( this !=null && this.accountName !=null){
            println(bankAccount.accountName)
        }
    }
    //run böyle de kullanılır.
    run {

    }
    with(bankAccount){
        if ( bankAccount !=null && bankAccount.accountName !=null){
            println(bankAccount.accountName)
        }

        if ( this !=null && this.accountName !=null){
            println(bankAccount.accountName)
        }
    }.run {
        println("Bank Account Created.")
    }


    bankAccount.also {
        if ( bankAccount !=null && bankAccount.accountName !=null){
            println(bankAccount.accountName)
        }

        if ( it !=null && it.accountName !=null){
            println(bankAccount.accountName)
        }
    }.run {

    }

    bankAccount.apply {
        if ( bankAccount !=null && bankAccount.accountName !=null){
            println(bankAccount.accountName)
        }

        if ( this !=null && this.accountName !=null){
            println(bankAccount.accountName)
        }
    }



}

data class BankAccount(
    val accountBalance:BigDecimal?,
    val accountName:String?,
)