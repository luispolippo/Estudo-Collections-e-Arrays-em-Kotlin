package one.digitalinnovation.collections

fun main() {

    //o intArrayOf não necessita que seja passado o tamnho do array na declaração.
    //Isso faz com que seja mais flexível adicionar valores durante a criação do código.
    val values = intArrayOf(2,3,4,1,10,7)


    //Todas os tipos de iteração funcionam sem diferença nenhuma.
    //Na função forEach a IDE declara por padrão a variavel it como iterador.
    values.forEach{
        println(it)
    }

    println("----------------------------")

    //Também pode ser ordenado da mesma forma que o IntArray
    values.sort()
    values.forEach{
        println(it)
    }




}