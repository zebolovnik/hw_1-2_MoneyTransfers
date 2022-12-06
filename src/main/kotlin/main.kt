package ru.netology

fun main() {
    val amount = 10000 // суммаПеревода
    val percent = 0.75 // процентКомиссии 0,75%
    val minRate = 35 // минимальнаяКомиссия 35руб
//    resultPercent = итоговаяСуммаКомиссии

    val resultPercent = amount * (percent / 100) // расчет суммы комиссии
    println("Сумма комиссии составит: " +
            (if (resultPercent < minRate) minRate else resultPercent) + " руб.")
}