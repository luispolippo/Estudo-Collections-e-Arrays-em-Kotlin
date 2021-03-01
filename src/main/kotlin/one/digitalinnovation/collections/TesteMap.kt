package one.digitalinnovation.collections

fun main() {
    //Criamos uma variavel chamada pair que instancia um Par de valores.
    //Dizemos também que esse par dever conter um valor do tipo String e um valor do tipo Double
    // Passamos para esse par os valores João e 1000.0
    val pair: Pair<String, Double> = Pair("João", 1000.0)

    //Map é uma coleção com chaves(keys) e valores(values)
    //Instancioamos um map com a variavel pair
    val map1 = mapOf(pair)

    //Podemos iterar o map usando um forEach
    //Usamos variaveis para informar qual é a chave(k) e qual é o valor(v) do map
    map1.forEach{ (k,v) -> println("Chave: $k - Valor: $v")}

    println("-------------------------------")

    //Podemos instanciar maps de maneira mais simples como o exemplo abaixo
    //É como se fosse "Pedro é chave para(to) 2500.0" e "Maria é chave para(to) 3000.0"
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach{ (k,v) -> println("Chave: $k - Valor: $v") }


}