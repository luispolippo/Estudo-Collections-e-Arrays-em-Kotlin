package one.digitalinnovation.collections

fun main() {

    //Declaração de Array de Strings mais verbosa. Há a necessidade de passar o tamnho do Array e ,
    // caso não seja declarado algum valor do array no momento da criação, deve-se deixar claro o tipo do Array
    // usando Array<TIPO>.
    val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"


    //Irteração com o for funciona normalmente com Strings
    for(nome in nomes){
        println(nome)
    }

    println("-----------------------------")

    //Com um Array de Strings podemos colocar os valores em ordem alfabética usando a função sort()
    //Função forEach também funciona normalmente com Array de String
    nomes.sort()
    nomes.forEach{ println(it) }

    println("-----------------------------")

    //Maneira menos verbosa de declarar String. Usando arrayOf não precisamos dizer seu tamanho e podemos declarar
    //os valores de forma mais flexível
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")

    nomes2.sort()
    nomes2.forEach{ println(it) }
}