//fxn overloading Same name different parameters
fun main(){
    println(addition(2,3))
    println(addition(2,5))
}

fun addition(a: Int, b: Int) : Int
{
    return a+b
}

fun addition(a: Double, b: Double): Double
{
    return a+b
}