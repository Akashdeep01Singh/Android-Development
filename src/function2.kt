fun main(){
    val a =sum()
    println(a)
    val ss = product(10,5.5)
    println(ss)
}

fun sum(): Int
{
    var a= 20
    var b= 25
    val sum =a+b
    return sum
}

fun product(x:Int,y: Double):Double
{
    val result= x * y
    return result
}