fun main(){
    val sum = 11000.0
    val discount1 = 100
    val discount2 = sum * 0.05

    val regularVisitor: Boolean = true
    var resalt = sum
    when {
        0 < sum && sum < 1000 -> resalt = sum
        1001 < sum && sum < 10000 -> resalt = sum - discount1
        10001 < sum -> resalt = sum - discount2
    }
    val discount3 = resalt * 0.01
    if (regularVisitor == true) println("Цена с учетом скидки составит:" + " " + (resalt - discount3)) else println("Цена с учетом скидки составит: $resalt")


}