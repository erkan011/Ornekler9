fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)

    val contains = numbers.contains(3)
    val contains1 = numbers.contains(6)
    val contains2 = numbers.contains(10)

    println("Liste de 3 var mı: $contains") //true
    println("liste de 6 var mı: $contains1") //true
    println("liste de 10 var mı: $contains2") //false

}