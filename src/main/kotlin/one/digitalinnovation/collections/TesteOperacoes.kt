package one.digitalinnovation.collections

fun main() {

    //Declara um doubleArray
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    //Imprime na tela os valores
    for(salario in salarios){
        println(salario)
    }

    println("-----------------------------")

    //Função para descobrir maior valor do Array
    println("Maior salário: ${salarios.max()}")

    //Função para descobrir menor valor do Array
    println("Menor salário: ${salarios.min()}")

    //Função para descobrir a média dos valores do Array
    println("Média dos salários: ${salarios.average()}")

    println("-----------------------------")

    //Função filter filtra os salários com base na operação lógica passada.
    //Caso a operação lógica seja true ele manda o valor para uma Coleção, por isso temos que atribuir uma
    //variável para essa Coleção.
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    salariosMaiorQue2500.forEach { println(it) }
}