package Classes

abstract class MCDonalds{
    abstract val fridge:Fridge
    abstract val superVisor:SuperVisor
    abstract val employeeOne:Employee
    abstract val employeeTwo:Employee
    abstract val employeeThree:Employee
    abstract val menuList: List<McHamburger>

    abstract fun clean(clock:Int)

    //opsiyonel
    open val policeOfficer:Police = TODO()

}

abstract class McDonaldsExpress:MCDonalds(){
    abstract fun sellCoffee():McCoffee
    override fun clean(clock: Int){
       println("Clean Time: $clock")
    }
}
class McDonaldsMaltepe: MCDonalds(),McDonaldsService{
    override val fridge: Fridge
        get() = TODO("Not yet implemented")

    override val superVisor: SuperVisor
        get() = TODO("Not yet implemented")

    override val employeeOne: Employee
        get() = TODO("Not yet implemented")

    override val employeeTwo: Employee
        get() = TODO("Not yet implemented")

    override val employeeThree: Employee
        get() = TODO("Not yet implemented")

    override val menuList: List<McHamburger>
        get() = TODO("Not yet implemented")

    override fun clean(clock: Int) {
        TODO("Not yet implemented")
    }

    override val policeOfficer: Police
        get() = super.policeOfficer
}