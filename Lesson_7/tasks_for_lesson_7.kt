fun main() {
    // Задание 1. Странная касса
    /*
    val age = 86
    val minAge = 18

    val isAccessible = age >= minAge
    println(isAccessible)
    */

    // Задание 2. Еще более странная касса
    /*
        val age = 86
        val minAge = 18
        val maxAge = 85

        val isAccessible = age >= minAge && age <= maxAge
        println(isAccessible)
    */

    // Задание 3. Ну мы так вообще разоримся...
    /*
        val age = 85
        val minAge = 18
        val maxAge = 85
        val time = 22

        val isAccessible = (age >= minAge && age <= maxAge) && (time >= 8 && time < 23)
        println(isAccessible)
    */

    // Задание 4. Ну хоть что-то светлое
    val age = 85
    val minAge = 18
    val maxAge = 85
    val time = 23
    val isLucky = true

    val isAccessible = ((age >= minAge && age <= maxAge) && (time >= 8 && time < 23)) || isLucky
    println(isAccessible)
}


