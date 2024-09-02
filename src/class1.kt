// Class 1: Person
class Person(val name: String, val age: Int) {
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

// Class 2: Car
class Car(val brand: String, val model: String, val year: Int) {
    fun displayInfo() {
        println("Brand: $brand, Model: $model, Year: $year")
    }
}

fun main() {
    // Object 1: Person
    val person1 = Person("Alice", 30)
    person1.displayInfo()

    // Object 2: Car
    val car1 = Car("Toyota", "Camry", 2021)
    car1.displayInfo()
}