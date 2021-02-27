package one.digitalinnovation.collections

fun main() {

    //Criação de um IntArray. Obrigatório informar o tamanho do array entre parenteses.
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //For pra percorrer os valores do IntArray
    for(valor in values){
        println(valor)
    }

    println("-----------------------------------")

    //Função forEach que percorre os valores usando internamente uma função lambda
    values.forEach{ valor ->
        println(valor)
    }

    println("-----------------------------------")

    //Neste caso a variável index itera sobre os indices do Array values e não sobre os valores
    //No println, para conseguirmos os valores, temos que passar o Array, no caso values,
    //e o índece, que está na variavel index
    for(index in values.indices){
        println(values[index])
    }

    println("-----------------------------------")

    //Função .sort organiza os valores em ordem crescente
    values.sort()
    for(valor in values){
        println(valor)
    }
}
