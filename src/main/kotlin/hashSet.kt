fun main() {
    val hashSet = HashSet<String>()

    hashSet.add("Apple")
    hashSet.add("Banana")
    hashSet.add("Orange")
    hashSet.add("Apple") // Bu öge zaten var bu yüzden eklenmiyecektir

    println("hashSet: $hashSet")

    //bir ögenin var olup olmadığını kontrol et
    val containsBanana = hashSet.contains("Banana")
    println("HashSet contains Banana: $containsBanana")

    //hashSet in boyutunu al
    val size = hashSet.size
    println("Size of HashSet: $size")
}