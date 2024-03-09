class Peron(val name: String, val age: Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Peron) return false

        return this.name == other.name && this.age == other.age
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val person1 = Peron("Erkan", 22)
    val person2 = Peron("Erkan", 22)

    println(person1.hashCode())
    println(person2.hashCode())
}