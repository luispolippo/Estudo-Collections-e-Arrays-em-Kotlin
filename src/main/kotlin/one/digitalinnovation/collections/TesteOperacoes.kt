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
    println("Maior salário: ${salarios.maxOrNull()}")

    //Função para descobrir menor valor do Array
    println("Menor salário: ${salarios.minOrNull()}")

    //Função para descobrir a média dos valores do Array
    println("Média dos salários: ${salarios.average()}")

    println("-----------------------------")

    //Função filter filtra os salários com base na operação lógica passada.
    //Caso a operação lógica seja true ele manda o valor para uma Coleção, por isso temos que atribuir uma
    //variável para essa Coleção.
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    salariosMaiorQue2500.forEach { println(it) }

    println("-----------------------------")

    //Função count conta quantos valores ou objetos temos dentro do array e nos retorna o número.
    //No exemplo estamos passando uma condição para a contagem. Será contado somente os valores
    // que estejam entre 2000 e 5000.
    println(salarios.count{it in 2000.0..5000.0})

    println("-----------------------------")

    //Operação find é usada para encontrar um valor dentro de um array e retorna esse valor.
    //Caso o valor não seja encontrado retornará null
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("-----------------------------")

    //Operação any procura no array se existe algum resultado com a operação informada.
    //Caso encontre retorna TRUE e caso não retorna FALSE
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })

}

