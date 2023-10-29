fun main() {
    // List
    val fruits = listOf("Apple", "Pineapple", "Strawberry", "Banana");

    // For
    for (fruit in fruits) {
        println("Today I'm gonna eat $fruit")
    }

    // ForEach
    fruits.forEach { fruit -> println("Yesterday I ate $fruit") }

    // Lambda (anonymous function) -> scroll through list
    val fruitCharacters: List<Int> = fruits.map { fruit -> fruit.length }
    println(fruitCharacters)

    // filter list
    val fruitCharactersFiltered: List<Int> = fruitCharacters.filter { fruit -> fruit <= 6 }
    println(fruitCharactersFiltered)
}