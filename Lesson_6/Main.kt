fun main() {
    // Задание 1. Код не работает так как не правильное обращение к элементам
    // необходимо писать с маленькой буквы: first, second, third
    val date = Triple(29, 05, 2023)
    val day = date.First

    // Задание 2.
    val coordinates2D = Pair(15, 25)
    var x = coordinates2D.first
    var y = coordinates2D.second

    // Задание 3.
    val dateMonthYear = Triple(22, 5, 2024)
    var (_, month, year) = dateMonthYear

    // Задание 4.
    month = 10
    val newMonthYear = Pair(month, year)

    // Задание 5. Код не работает т.к. name это константа,
    // замени val на var и будет работать =)
    val name = "Artem"
    name += " Blazhievskii"

    // Задание 6.
    val character: Character = "Cat" // Правильный тип Char, значение должно быть только 1 символ и внутри ''
    val character: Char = 'c' // Ok
    val string: String = "Cat" // Ok
    val string: String = 'c' // Значение должно быть внутри ""

    // Задание 7.
    val a = 7
    val b: Short = 100
    val c: Byte = 12
    val sum = a + b - c // Тип данных Int,
}


