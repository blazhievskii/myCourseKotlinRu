fun main() {

    val weekday = "Понедельник"
    print("$weekday, часы работы: ")
    //print не добавляет в конце перенос на новую строку,
    // поэтому время работы будет отображаться на одной строке с этим текстом

    // Задача 1
    if (weekday == "Понедельник") {
        println("с 8:00 до 12:00 (8:00 - 12:00)")
    } else if (weekday == "Вторник") {
        println("с 8:00 до 18:00 (8:00 - 18:00)")
    } else if (weekday == "Среда") {
        println("с 8:00 до 18:00 (8:00 - 18:00)")
    } else if (weekday == "Четверг") {
        println("с 8:00 до 18:00 (8:00 - 18:00)")
    } else if (weekday == "Пятница") {
        println("с 8:00 до 21:00 (с 8:00 до 21:00)")
    } else if (weekday == "Суббота") {
        println("с 9:00 до 16:00 (9:00 - 16:00)")
    } else if (weekday == "Воскресенье") {
        println("с 8:00 до 16:00 (8:00 - 16:00)")
    }

    // Задание 2
    val hour = 11

    // сразу записываю результат проверки в переменную. Желательное этот код написать через when,
    // в бонусной задаче будет видно на сколько этот способ проще
    val isOpen = if (weekday == "Понедельник") {
        hour >= 8 && hour <= 12
    } else if (weekday == "Вторник" || weekday == "Среда" || weekday == "Четвер") {
        hour >= 8 && hour <= 18
    } else if (weekday == "Пятница") {
        hour >= 9 && hour <= 16
    } else if (weekday == "Суббота") {
        hour >= 9 && hour <= 16
    } else if (weekday == "Воскресенье") {
        hour >= 8 && hour <= 16
    } else {
        false
    }

    if (isOpen) {
        println("Гарцующая кобыла сейчас открыта")
    } else {
        println("Гарцующая кобыла сейчас закрыта")
    }

    // Бонус. Задача 3
    when {
        weekday == "Понедельник" -> println("с 8:00 до 12:00 (8:00 - 12:00)")
        weekday == "Вторник" -> println("с 8:00 до 18:00 (8:00 - 18:00)")
        weekday == "Среда" -> println("с 8:00 до 18:00 (8:00 - 18:00)")
        weekday == "Четверг" -> println("с 8:00 до 18:00 (8:00 - 18:00)")
        weekday == "Пятница" -> println("с 8:00 до 21:00 (с 8:00 до 21:00)")
        weekday == "Суббота" -> println("с 9:00 до 16:00 (9:00 - 16:00)")
        weekday == "Воскресенье" -> println("с 8:00 до 16:00 (8:00 - 16:00)")
    }
    
    // Бонус. Задача 4
    val isOpen_2 = when (weekday) {
        "Понедельник" -> hour >= 8 && hour <= 12
        "Вторник", "Среда", "Четверг" -> hour >= 8 && hour <= 18
        "Пятница" -> hour >= 8 && hour <= 21
        "Суббота" -> hour >= 9 && hour <= 16
        "Воскресенье" -> hour >= 8 && hour <= 16
        else -> false
    }
    if (isOpen_2) {
        println("Гарцующая кобыла сейчас открыта")
    } else {
        println("Гарцующая кобыла сейчас закрыта")
    }
}