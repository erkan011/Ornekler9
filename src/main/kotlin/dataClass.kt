data class User(val id: Int, val name: String, val age: Int)

fun main() {

    val user1 = User(1, "Erkan", 22)
    // toString() metodu kullanılarak nesnenin dizesel temsilini almak
    println("user1: $user1")

    val user2 = User(2,"Eymen", 7)
    //equals metodu ile nesneleri karşılaştırma
    println(user1 == user2)

    //hashCode metodu
    println(user1.hashCode())

    //copy metodu ile nesnenin bir kopyasını oluşturmak
    val user3 = user1.copy()
    println(user3)

    //veri alanlarına erişim
    println(user1.id)
    println(user1.name)
    println(user1.age)

    //// Destructuring declarations ile veri alanlarına erişim
    val (id, name, age) = user1
    println("$id , $name, $age")

}