const val NAME = "Santiago Molano";

// Control structures
fun getRole(roleId: Int): String {
    val rol: String = if (roleId == 1) {
        "Administrador"
    } else if (roleId == 2) {
        "Analista"
    } else {
        "Cliente"
    }
    return rol;
}

// Loops
fun loader() {
    var count = 0;
    var message = "Cargando";
    print(message)
    while (count < 40) {
        message += "."
        println(message)
        count++;
    }
    println("")

    do {
        println("Generando numero aleatorio...")
        val randomNumber = (0..100).random()
        println("Numero generado: $randomNumber")
    } while (randomNumber < 80)
}

fun getAccount() {
    println("Ingrese ID de la cuenta");
    val accountId = readlnOrNull().toString().toInt()
    // loader()
    when (accountId) {
        1 -> {
            println("Ahorros   | Bancolombia | 58000004527")
        }

        2 -> {
            println("Ahorros   | RappiPay    | 21400004527")
        }

        3 -> {
            println("Ahorros   | Nequi       | 36900004527")
        }

        4 -> {
            println("Corriente | Davivienda  | 44800004527")
        }

        else -> {
            println("No existe la cuenta")
        }
    }
    println("- - - - - - - - - - - - - - - - - - -")
    println("")
}

fun main(args: Array<String>) {
    // immutable
    // String
    val profession: String = "Backend developer";
    val roleId: Int = 2;
    val rol = getRole(roleId);

    // mutable
    // Integer
    var money: Int = 80000;

    getAccount()

    // Interpolation or templates
    println("$rol $NAME! su saldo actual: $ $money COP");
    println("");
    money = 45000;
    println("Qué desea hacer hoy como $profession?");
    println("");
    println("Se ha gastado $ 35000 COP, ahora tiene $ $money COP");

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