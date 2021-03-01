package one.digitalinnovation.collections

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
