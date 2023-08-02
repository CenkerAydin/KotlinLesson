package Classes

import java.lang.IllegalArgumentException
import kotlin.properties.Delegates

class User85 {
    var name:String by Delegates.observable("Initialized Value"){
        property, oldValue, newValue -> println("$oldValue -> $newValue")
    }
}

var max: Int by Delegates.vetoable(0){
    property, oldValue, newValue ->
    if (newValue >oldValue) true else throw IllegalArgumentException("New value must be larger than old value")
    newValue >oldValue
}

var max2:Int by Delegates.observable(0){
    property, oldValue, newValue ->
    true
}

fun main() {

    val deneme=DenemeObservable(object :Notify{
        override fun onNotify(oldValue: Int, newValue: Int) {
            println("Old Balance: $oldValue, new balance: $newValue")
        }
    })
    deneme.balance=1231

    val user=User85()
    user.name="first"
    user.name="second"

    println(max) //0

    max=10
    println(max) //10

    max=5 //will fail with IllegalArgumentException
    println(max) //0

 
}

//OBSERVABLE PATTERN
interface Notify{
    fun onNotify(oldValue:Int, newValue:Int)
}

class DenemeObservable(val notify: Notify){
    var balance :Int=0
        set(value) {
            notify.onNotify(field,value)
            field=value
        }
}