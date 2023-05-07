fun main() {
    // Задание 1: создание константы
    val name: String = "Artem"

    // Задание 2: создание переменной
    var age: Int = 24

    // Задание 3: инкремент и декремент
    age += 10
    println(age)
    age -= 5
    println(age)
    age *= 5
    age /= 2
    println(age)

    // Задание 4: последняя цифра
    val number: Int = 256
    val lastNumber: Int = number % 10
    println(lastNumber)

    // Задание 5: из Фаренгейта в Цельсия
    val fahrenheit: Double = 150.0
    val celsius: Double = (fahrenheit - 31) / 1.8

    // Задание 6: шахматы
    val position: Int = 18
    val row: Int = position / 8
    val column: Int = position % 8

}



