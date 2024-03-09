@file:Suppress("NAME_SHADOWING")

fun main() {

    // 1. HashMap nesnesini oluşturun
    val hasMap = HashMap<String,Int>()

    //anahtar değer çiftlerini ekleme
    hasMap["key1"] = 10
    hasMap["key2"]= 20

    // 3. Bir anahtara karşılık gelen değeri alma
    val deger = hasMap["key1"]
    println("key1 değeri: $deger")

    for ((anahtar, deger) in hasMap){
        println("$anahtar -> $deger")
    }
}