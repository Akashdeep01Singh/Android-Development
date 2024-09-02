fun main()
{
    val number = 2
    for(i in 1..10)
    {
        //2 x 1 = 2
//        println(number.toString() + " x " + i + " = " + (number * i))
        //string templating
        println("$number x $i = ${number * i}")
    }
}