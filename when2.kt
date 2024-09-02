fun main(){
    println("--------------usage of when-----------")
    var choice = 2
    val result = when(choice){
        1 -> "hi"
        2 -> "hello"
        3 -> "namaske"
        4 -> " venkama"
        else -> "no need"
    }
    println(result)
}