package Loop

fun main() {
    var num=0
    while (num <5){
        print("${num++}")
    }
    println()

    for (v in 0..110){
        if(v<5){
            print("$v , ")
        }
    }
}