fun main() {
    // List
    val nameList = listOf("Santiago", "Isabella", "Gabriel", "Laura")

    // Empty list
    val emptyList = mutableListOf<String>();

    // Add sth to list
    emptyList.add("Molano")

    // Get value from a list by get
    val valueByGet = emptyList.get(0)

    // Get value from a list by operator
    val valueByIndex = emptyList[0]

    // Get first value from a list
    val firstValue = emptyList.first()

    // Get first value from a list that can be null
    val firstValueCanBeNull: String? = emptyList.firstOrNull()

    // Delete value from a list
    emptyList.removeAt(0)

    // Delete value from a list by condition
    emptyList.removeIf { value -> value.length > 4}

    // Array
    val myArr = arrayOf(1,2,3,4,5,6)

    // Use arrays only to performance, else use list in Kotlin
}