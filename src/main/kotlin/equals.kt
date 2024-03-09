class Person(val x:String, val y: Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true //kendi kendine eşitlik kontrolü
        if (other !is Person) return false//Diğer nesnenin point türünde olup olmadığını kontrol et

        //diğer nesnenin x veya y değerini karşılaştır
        return this.x == other.x && this.y == other.y
    }
}

fun main() {
    val point1 = Person("Erkan",6)
    val point2 = Person("Ali",4)
    val point3 = Person("Erkan",6)

    println(point1 == point2)// true, çünkü x ve y değerleri aynı
    println(point1 == point3)// false, çünkü x ve y değerleri farklı
}