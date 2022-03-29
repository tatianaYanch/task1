package com.example.task1


fun main() {
    while (true) {
        println("Введите первое число:")
        val firstNumber = readLine()?.toDoubleOrNull()
        if (firstNumber == null) {
            println("Ошибка! Вы ввели не число")
            continue
        } else {
            println("Введите второе число:")
            val secondNumber = readLine()?.toDoubleOrNull()
            if (secondNumber == null) {
                println("Ошибка! Вы ввели не число")
                continue
            }
            println("Введите оператор (+, -, *, /):")
            val operator = readLine()
            val result = calculate(firstNumber, secondNumber, operator)
            println(String.format("$firstNumber $operator $secondNumber = %.1f", result))
        }
    }
}


fun calculate(firsNumber: Double, secondNumber: Double, operator: String?): Double {
    var res = 0.0
    when (operator) {
        "+" -> res = firsNumber + secondNumber
        "-" -> res = firsNumber - secondNumber
        "*" -> res = firsNumber * secondNumber
        "/" -> res = firsNumber / secondNumber
        else -> println("!!!Вы ввели неверный оператор!!!")
    }
    return res
}