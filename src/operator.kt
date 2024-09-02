fun main(){
    var x=5
    println(x.shl(2))
    println(x.shr(1))

    var a= true
    var b= true
    if(a && b)
    println("true")
    var z = 7
    println(z)
    println(++z)
    println(z++)
    println(z)

    //elvis operators
    // Kotlin Program using Elvis Operator

    var st: String? = null
    var st1: String? = "May be declare nullable string"
    var len1: Int = st ?.length ?: -1
    var len2: Int = st1 ?.length ?: -1

    println("Length of st is ${len1}")
    println("Length of st1 is ${len2}")



}