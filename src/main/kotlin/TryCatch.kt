fun main() {
    var name: String? = null;

    try {
        name!!.length
    } catch (exception: NullPointerException) {
        println("Occurred an error during the execution")
    } finally {
        println("Finished the execution")
    }
}