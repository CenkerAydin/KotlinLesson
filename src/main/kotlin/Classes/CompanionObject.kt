package Classes

//Companion object ile singleton  thread safe sağlama.
class Singleton private constructor(){
    companion object{
        @Volatile private var instance:Singleton?=null
        fun getInstance()=
            instance ?: synchronized(this){
                instance ?: Singleton().also { instance=it }
            }
    }
}

interface HomeFragmentPresenter{
    fun navigate()
}

class HomeFragment{
    // const val TAG: String="HomeFragment"
    var color="Red"

    companion object{
        const val TAG: String="HomeFragment"

     private var homeFragment:HomeFragment? =null

        fun newInstance():HomeFragment{
            homeFragment = HomeFragment()
            return homeFragment as HomeFragment
        }
    }
}

fun main() {
    val homeFragment=HomeFragment.newInstance()
    homeFragment.color="Blue"
    val homeFragment2=HomeFragment.newInstance()
    homeFragment2.color="Yellow"
    val homeFragment3=HomeFragment.newInstance()
    val homeFragment4=HomeFragment.newInstance()
    homeFragment4.color="Cyan"
    val homeFragment5=HomeFragment.newInstance()
    homeFragment5.color="Magenta"

    println("HomeFragment color: ${homeFragment.color}")
    println("HomeFragment2 color: ${homeFragment2.color}")
    println("HomeFragment3 color: ${homeFragment3.color}")
    println("HomeFragment4 color: ${homeFragment4.color}")
    println("HomeFragment5 color: ${homeFragment5.color}")

}