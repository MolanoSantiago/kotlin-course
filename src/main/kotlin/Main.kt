const val NAME = "Santiago Molano";

fun main(args: Array<String>) {
    // immutable
    val profession: String = "Backend developer";

    // mutable
    var money: Int = 80000;

    println("Hola $NAME! su saldo actual: $money COP");
    println("");
    money = 45000;
    println("Qué desea hacer hoy como $profession?");
    println("");
    println("Se ha gastado 35000 COP, ahora tiene $money");
}