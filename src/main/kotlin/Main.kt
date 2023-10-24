const val NAME = "Santiago Molano";

fun main(args: Array<String>) {
    // immutable
    // String
    val profession: String = "Backend developer";

    // mutable
    // Integer
    var money: Int = 80000;

    // Interpolation or templates
    println("Hola $NAME! su saldo actual: $ $money COP");
    println("");
    money = 45000;
    println("Qué desea hacer hoy como $profession?");
    println("");
    println("Se ha gastado $ 35000 COP, ahora tiene $ $money");

    // Boolean
    val boolean: Boolean = true;
    println("");
    println("Disponible avance en pesos: $boolean");

    // Long
    val long: Long = 123456789123456789;
    println("");
    println("Cantidad avance en pesos: $ $long");

    // Double
    val double: Double = 12500.87;
    println("");
    println("Debe exactamente en la TC: $ $double");

    // Float
    val float: Float = 1.1f;
    println("");
    println("Cashback de este mes: $ $float");
}