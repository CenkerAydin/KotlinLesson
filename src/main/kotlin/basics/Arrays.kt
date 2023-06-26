package basics

fun main() {            //index=0 ,1 ,2 ,3 ,4 ,5
    val studentNumbers= arrayOf(13,45,23,45,67,78)
    val studentNames= arrayOf("Ahmet","Cenker","Melisa","Ecem")
    val charArray= arrayOf('A','C','M','E')
    val mixedArray= arrayOf<Any>(13,"Cenker",'V',true)
    val arrayNulls= arrayOfNulls<String>(4)

    //Higher Order Function
    //4 elemanlı, tum elemanları 3.14 * indexDegeri olan bir dizi olusturur.
    val num=Array<Double>(4){
        3.14*it
    }
    num.forEach { println(it) }

    //10 elemanlı, 0-9 arasındaki index degerlerinin karesini alan bir dizi olusturur.
    val numbers=Array<Unit>(10){
        println(it*it).toString()
    }

    val firstCharArrays =CharArray(4)
    firstCharArrays[0]='C'
    firstCharArrays.set(1,'E')
    firstCharArrays.set(3,'K')
    firstCharArrays[2]='N'

    println("Index 2: "+firstCharArrays.get(2))
    println("Index 0: "+firstCharArrays[0])


}

