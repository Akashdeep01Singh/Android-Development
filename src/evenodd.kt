fun main(args: Array<String>) {
    val a = arrayOf(3, 4, 5, 6, 7, 8, 9)
    var sumeven = 0
    var sumodd = 0
    for (i in a) {
        if (i % 2 == 0) {
            print("even numbers : ")
            println(i)
            sumeven += i
        }
        else  {
            print("odd numbers : ")
            println(i)
            sumodd += i
        }
    }
    println("Sum of even numbers: $sumeven")
    println("Sum of odd numbers: $sumodd")


    }











