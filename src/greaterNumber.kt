
//fun main(){
//    var a=20
//    a=55
//    var b=15
////    var A=25
////    var ___a=48
////    println(___a)
////    var int =88
////    println(int)
////    var String=44
////    println(String)
////    println("hello world")
//    var age: Int =25
//    println(age)
//    val result = "sum of $a and $b is ${a+b}"
//    print(result)
//}

fun main()
{
    val numbers = arrayOf(1, 2, 6, 4, 5)
    println(numbers[0])
    for(i in numbers){
        println(i)
    }
    val words: Array<String> = arrayOf("kotlin","java","python")

    val squares = Array(5){i -> i*i}
    println("Size of array is: ")
    println(squares.size)
    println(squares.isEmpty())
    println(numbers.first())
//    println(numbers.size())
//    println(numbers.get())
//    println(numbers.set())
//    println(numbers.lastIndex())
//    println(numbers.all {  }())
//    println(numbers.drop())
//    println(numbers.toList())
}