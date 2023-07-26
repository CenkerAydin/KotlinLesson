package Classes

interface TeamsFunctionality {
    fun practice()
}

enum class ColorType {
    RED, BLUE, WHITE
}

enum class Teams(val starCount: Int) : TeamsFunctionality {
    BESIKTAS(3) {
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
    GALATASARAY(4) {
        override fun practice() {
            TODO("Not yet implemented")
        }
    },
    FENERBAHÇE(3) {
        override fun practice() {
            TODO("Not yet implemented")
        }
    },

    TRABZONSPOR(1) {
        override fun practice() {
            TODO("Not yet implemented")
        }
    }
}

enum class DaysOfWeek(val dayNumber: Int) {
    Pazartesi(1) {

    },
    Sali(2) {

    },
    Carsamba(3) {

    },
    Persembe(4) {

    },
    Cuma(5) {

    },
    Cumartesi(6) {

    },
    Pazar(7) {

    }
}

enum class Sex {
    Male {
        override val typeCount: Int
            get() = TODO()

        override fun isOptional() {
            TODO()
        }

        override fun log() {
            super.log()
            println("MALE")
        }
    },
    Female {
        override val typeCount: Int
            get() = TODO()

        override fun isOptional() {
            TODO()
        }
    },
    Other {
        override val typeCount: Int
            get() = TODO()

        override fun isOptional() {
            TODO()
        }
    };

    abstract val typeCount: Int
    abstract fun isOptional()
    open fun log() {}
}

fun main() {
    val fb = "FENERBAHÇE"
    val gs = "GALATASARAY"
    val bjk = "BEŞİKTAŞ"
    val ts = "TRABZONSPOR"

    val pzt = "Pazartesi"
    val sal = "Salı"
    val car = "Çarşamba"
    val per = "Perşembe"
    val cum = "Cuma"
    val cmt = "Cumartesi"
    val paz = "Pazar"

    val male = "MALE"
    val female = "FEMALE"

    println("4 Büyük takımdan birini yazınız.")
    val team: String = readLine()!!

    val starCount = when {
        team == fb -> {
            3
        }

        team == gs -> {
            4
        }

        team == bjk -> {
            3
        }

        team == ts -> {
            2
        }

        else -> {
            -1
        }
    }

    val starCount2= when(team){

        /*Teams.FENERBAHÇE.name.uppercase(){

        }*/
        Teams.FENERBAHÇE.toString() ->{
            Teams.FENERBAHÇE.starCount
        }
        Teams.GALATASARAY.toString() ->{
            Teams.GALATASARAY.starCount
        }
        Teams.BESIKTAS.toString() ->{
            Teams.BESIKTAS.starCount
        }
        Teams.TRABZONSPOR.toString() ->{
            Teams.TRABZONSPOR.starCount
        }
        else ->{
            -1
        }
    }

    val other="OTHER"

    println(DaysOfWeek.Carsamba.name)
    println(DaysOfWeek.Carsamba.toString())

    println(Teams.FENERBAHÇE.name)
    println(Teams.FENERBAHÇE.toString())

    println(DaysOfWeek.Carsamba.ordinal)
    println(DaysOfWeek.Carsamba.dayNumber)


    val bestTeam= getBestTeam(Teams.BESIKTAS)
}

fun getBestTeam(team:Teams): Teams{
    return team
}