package one.digitalinnovation.collections

fun main() {

    //Arrays do tipo DoubleArray funcionam exatamente como os outros Arrays vistos, porém só aceitam
    //valores do tipo Double.
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("----------------------------")

    // A função .forEachIndexed nos permite não só controlar o valor do Array como também seu índice.
    // É muito usada para garantir a atribuição de valores às posição do Array.
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("-----------------------------")

    //Usando o doubleArrayOf para declarar um Array de double não precisamos dizer o tamanho do array desde que
    //seja infomrado os valores na declaração.
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)

    //Podemos usar o sort() para colocar nosso Array em ordem crescente
    salarios2.sort()
    salarios2.forEach { println(it) }


}