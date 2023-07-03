package Loop

fun main() {

    for(value:Int in 1..10){
        print("$value ")
    }
    println()
    val countryCodeArray= arrayOf("tr","az","en","fr")

    for (value in countryCodeArray){
        print("$value ")
    }
    println()
    for (index in countryCodeArray.indices){ // indices bize IntRange bilgisi döner.
        print("\n$index değeri: ${countryCodeArray[index]} ")
    }
    println()
    for ((i,v) in countryCodeArray.withIndex()){
        print("\n$i değeri: $v")
    }

    countryCodeArray.withIndex().forEach{iterable ->
        iterable.index
        iterable.value
    }

    repeat(10){
        it-> print("\n$it daha çok kod lazım")
    }

    for(v in 1..50) {
        if (v % 2 == 1) {
            continue
        }
        print("\n$v ")
    }

    for (v in 1..50){
        if (v %2==1){
            break
        }
        print("\n$v")
    }

    for(value in 1..50){
        for (value2 in 0..10){
            if (value2 ==5){
                continue
            }
            print("continue1: $value2")
        }
    }

    returnLabel@ for (v in 1..50){
        for (v2 in 0..10){
            if (v2==5){
                continue@returnLabel
            }
            print("continue2: $v2")
        }
    }
}