fun main() {
    // Задание 1: конкатенация
    val firstName = "Артем"
    val surname = "Блажиевский"
    val fullName = firstName + " " + surname

    // Задание 2: интерполяция (строковые шаблоны)
    val myDetails = "Привет, меня зовут $firstName $surname"

    // Задание 3: вывод типа (type inference)
    val number1 = 21
    val number2: Int = 12

    // Задание 4: приведенеие типов
    val averageValue = (number1.toDouble() + number2) / 2
    println(averageValue)

    // Задание 5: из строки в число
    val age: String = "24"
    println(age + 10)
    println(age.toInt() + 10)


}





