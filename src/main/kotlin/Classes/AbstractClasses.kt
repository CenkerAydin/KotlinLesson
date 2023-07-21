package Classes

interface McDonaldsService{
     fun motoCarrier()
}
abstract class MCDonalds{

    abstract val fridge:Fridge
    abstract val superVisor:SuperVisor
    abstract val employeeOne:Employeee
    abstract val employeeTwo:Employeee
    abstract val employeeThree:Employeee
    abstract val menuList: List<McHamburger>

    abstract fun clean(clock:Int)

    //opsiyonel
    open val policeOfficer:Police = TODO()

}

abstract class McDonaldsExpress:MCDonalds(){
    abstract fun sellCoffee():McCoffee
   final override fun clean(clock: Int){
       println("Clean Time: $clock")
    }
}
class McDonaldsMaltepe: MCDonalds(),McDonaldsService{
    override fun motoCarrier() {
        TODO("Not yet implemented")
    }

    override val fridge: Fridge
        get() = TODO("Not yet implemented")

    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")

    override val employeeOne: Employeee
        get() = TODO("Not yet implemented")

    override val employeeTwo: Employeee
        get() = TODO("Not yet implemented")

    override val employeeThree: Employeee
        get() = TODO("Not yet implemented")

    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override val policeOfficer: Police
        get() = super.policeOfficer
}

class McDonaldsMaltepeExpress :McDonaldsExpress(){
    override fun sellCoffee(): McCoffee {
        TODO("Not yet implemented")
    }

    override val fridge: Fridge
        get() = TODO("Not yet implemented")
    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")
    override val employeeOne: Employeee
        get() = TODO("Not yet implemented")
    override val employeeTwo: Employeee
        get() = TODO("Not yet implemented")
    override val employeeThree: Employeee
        get() = TODO("Not yet implemented")
    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

}

fun main() {

}

class Fridge

class SuperVisor
class McHamburger
class Police
class McCoffee
class Employeee