package one.digitalinnovation.collections

fun main() {

    //Declaramos 3 objetos da classe Funcionario
    val funcionario = Funcionario("João", 2000.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    //Inicializamos uma lista de funcionários com os objetos declarados
    val funcionarios = listOf(funcionario, funcionario2, funcionario3)

    //Iteração da lista de funcionários com forEach
    //Neste caso a variável it representa o objeto instanciado, que por sua vez possue os atributos nome, salário e tipo
    funcionarios.forEach{ println(it) }

    println("---------------------------")

    //Caso quisessemos buscar somente o objeto em que o atributo nome seja Maria
    println(funcionarios.find { it.nome == "Maria" })

    println("---------------------------")

    //Podemos usar a operação sortedBy para ordenar, em ordem crescente, nossa lista de objetos
    //Ao usar a operação precisamos informar por qual atributo do objeto queremos ordenar.
    //No caso estamos ordenando pelo atributo salario e encadenado uma operação forEach para imprimir o resultado.
    //Ao usar uma operação encadeada podemos notar que será impresso o que pedimos, porém as alterações não serão salvas.
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("---------------------------")

    //Podemos usar o groupBy para agrupar nossos objetos por um atributo
    //Neste exemplo estamos agrupando pelo atributo tipoContratacao
    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it) }

    //Nestes exemplos passados até agora, estamos usando lista da API Collections. Por esse motivo não temos operações
    //que adiconam novos valores na lista. Para lista que podemos adicionar valores devemos usar a MutableList.


}

//Criação de uma data class Funcionário para usar no exemplo
data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipoContratacao:String
) {
    //Sobreposição da função toString() para facilitar a visualização
    override fun toString() = """
            Nome: $nome
            Salário: $salario
        """.trimIndent()

}