package one.digitalinnovation.collections

fun main() {

    //Declaramos 3 objetos da classe Funcionario
    val funcionario = Funcionario("João", 2000.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    println("-------------LIST--------------")

    //Criamos um mutableList com funcionario e funcionario3
    val funcionarios = mutableListOf(funcionario, funcionario3)
    funcionarios.forEach{ println(it) }

    println("----------------------------")

    //Quando usamos coleções mutaveis podemos alterar valores da coleção
    //No exemplo abaixo adicionamos o funcionario2 à coleção usando a operação add
    funcionarios.add(funcionario2)
    funcionarios.forEach{ println(it) }

    println("-----------------------------")

    //Neste exemplo removemos da Lista o funcionario
    funcionarios.remove(funcionario)
    funcionarios.forEach { println(it) }

    //Toadas as operações já vistas em Coleções não-mutaveis, também funcionam nas coleções mutaveis


    println("---------------SET---------------")

    //Criamos um conjunto mutável usando mutableSetOf
    val funcionariosSet = mutableSetOf(funcionario)
    funcionariosSet.forEach { println(it) }

    println("------------------------------")

    //Podemos adicionar valores ao conjunto usando a operação add
    funcionariosSet.add(funcionario2)
    funcionariosSet.add(funcionario3)
    funcionariosSet.forEach { println(it) }

    println("------------------------------")

    //Também poodemos remover do conjunto usando a operação remove
    funcionariosSet.remove(funcionario3)
    funcionariosSet.forEach { println(it) }

}

