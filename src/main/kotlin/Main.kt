fun main() {
    val amount: Double = 1999999.5
    println("Комиссия за перевод $amount будет " + calcBribe(amount))
    val likes: Int = 121;
    println("Понравилось $likes " + cheloLud(likes))
    val orderSum: Double = 10_550.4
    val isRegular = true
    println("Сумма заказа $orderSum, скидка: " + calcDiscount(orderSum, isRegular))
}

// Задание №1
fun cheloLud(count: Int): String {
    return if (count % 10 == 1 && count % 100 != 11) "человеку" else "людям"
}

// Задание №2
fun calcBribe(sum: Double): Double {
    val stdBribe: Double = 0.75
    val minBribe: Double = 35.0
    return if (sum / 100 * stdBribe < minBribe) minBribe else sum / 100 * stdBribe;
}

// Задание №3
fun calcDiscount(sum: Double, isRegular: Boolean): Double {
    var discount: Double = 0.0
    if (sum > 1000)
        discount = 100.0
    if (sum > 10_000)
        discount = sum / 100 * 5
    // + 1% к скидке для постояльцев
    if (isRegular)
        discount += sum / 100 * 1
    return discount
}