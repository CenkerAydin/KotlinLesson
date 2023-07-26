package Classes

sealed class Response
class Success:Response(){

}
class Error: Response(){

}

sealed class Response2 {
    class Success2 : Response2(),TeamsFunctionality{
        override fun practice() {

        }

    }
    class Error2 : Response2()
}

fun handle(response:Response){
    when(response){
        is Success ->{
            //response'Dan gelen bilgilerle ui'ini doldur.
        }
        is Error ->{
            //Pop-up ile kullanıcıya bilgi ver.
        }
    }
}

//Bu yanlıştır. Enum kullanmanız gerekiyor.
sealed class PaymentOption{
    object Cash
    object Card
    object Transfer
}

enum class PaymentOption2{
    Cash, Card, Transfer
}

fun main() {
   // val response =Response() ->Sealed types cannot be instantiated
    val success=Success()
    val error=Error()
}