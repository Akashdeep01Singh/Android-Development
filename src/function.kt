fun main(){
    val result = add(4,5)
    println(result)
    val result2 =  add(6,8)
    println(result2)
    evenOdd(12)
    evenOdd(15)
}
fun add(num1: Int,num2: Int) = num1 + num2 //inline function
//fun add(num1: Int, num2: Int): Int
//{
//    val sum = num1 + num2
//    return sum
//}
  // unit is return-type for no return type variables
fun evenOdd(num1: Int) : Unit{
    val result = if(num1 %2 ==0) "Even" else "odd"
    println(result)
}