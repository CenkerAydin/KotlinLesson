package Classes

interface TransportationFunctions{
    fun run()
}

open class Auto: TransportationFunctions{
    open val name:String= ""
    open val color:String=""
    override fun run() {
        println("Run boy run")
    }
}

open class Bycle{
    open val name:String=""
    open val color:String=""
}

open class MiniCooper(
    override val name:String="MiniCooper",
    override val color:String="Red"
): Auto(){
    override fun toString(): String {
        return "name: $name, color: $color"
    }
    init {
        super.run()
    }
}

open class John: MiniCooper(){
    init {
        super.run()
    }
}

class JohnCabrio: John(){
    init {
        super.run()
    }
}

class Beetle(
    override val name:String="Beetle",
    override val color:String= "Yellow"
):Auto(){
    override fun toString(): String {
        return "Name: $name, color: $color"
    }
    init{
        super.run()
    }
}

open class Bisan(
    override val name:String="Bisan",
    override val color:String= "Blue"
):Bycle(),TransportationFunctions{
    override fun run() {
        println("Run boy run")
    }

    override fun toString(): String {
        return "name: $name, color: $color"
    }
}

class TransportFactory<T>(transportationVehicle:T){
    init {
        println(transportationVehicle.toString())
    }
}

fun main() {
    val miniCooper:MiniCooper = MiniCooper()
    val john:John= John()
    val johnCabrio:JohnCabrio= JohnCabrio()
    val beetle:Beetle= Beetle()

    val bycle:Bycle= Bycle()
    val bisan: Bisan= Bisan()

    val miniCooperFactory: TransportFactory<MiniCooper> = TransportFactory(miniCooper)
    val johnFactory:TransportFactory<John> =TransportFactory(john)
    val johnCabrioFactory: TransportFactory<JohnCabrio> = TransportFactory(johnCabrio)
    val beetleFactory: TransportFactory<Beetle> = TransportFactory(beetle)

   // val johnFactory2: TransportFactory<John> = TransportFactory<MiniCooper>(miniCooper)
    //out veya in kullanmazsan type mismatch alırsın
    // val johnFactory3: TransportFactory<John> =TransportFactory<JohnCabrio>(johnCabrio)
   val johnFactory4: TransportFactory<John> =TransportFactory<John>(john)
}

inline fun <reified T>calculate(number:Int,number2:Int):T{
    return  when(T::class.java){
        String::class.java -> {
            (number+number2) as T
        }
        else -> {
            (number+number2) as T
        }
    }
}
