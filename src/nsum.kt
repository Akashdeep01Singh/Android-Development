fun sumOfNumbers(n: Int): Int {
    return if (n == 0) {
        0
    } else {
        n + sumOfNumbers(n - 1)
    }
}

fun main() {
    val number = 5
    val result = sumOfNumbers(number)
    println("Sum of first $number natural numbers is: $result")
}