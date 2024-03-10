// Üst Sınıf
open class Sekil{
    open fun cevreHesapla():Double{
        return 0.0
    }
}
//Alt sınıf (Subclass), üst sınıfı miras alır
class Kare(private var kenarUzunlugu: Double) : Sekil(){
    override fun cevreHesapla(): Double {
        return 4 * kenarUzunlugu
    }
}

fun main() {
    val kare = Kare(5.0)
    println("Karenin Çevresi: ${kare.cevreHesapla()} birim")
}