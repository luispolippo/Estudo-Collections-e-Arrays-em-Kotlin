package one.digitalinnovation.collections

fun main() {

    //Declaramos 3 objetos da classe Funcionario
    val funcionario = Funcionario("João", 2000.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    //Usando o setOf podemos dividir nossos objetos em conjuntos
    val funcionarios1 = setOf(funcionario, funcionario2)
    val funcionarios2 = setOf(funcionario3)

    //Caso quisessemos juntar nossos conjuntos podemos usar a operação union, como no exemplo
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("----------------------------")

    //Podemos subtrair um conjunto que esteja dentro de outro conjunto usando a operação subtract
    //No exemplo abaixo criamos um conjunto chamado funcionarios3 e subtraímos o conjunto funcionarios2, que era
    //composto por Maria.
    val funcionarios3 = setOf(funcionario, funcionario2, funcionario3)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("----------------------------")

    //A operação intersect realiza a intersecção entre dois conjuntos, ou seja, descobre a semelhança entre os conjuntos
    //No exemplo abaixo ambos os conjuntos possuem o objeto Maria.
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}