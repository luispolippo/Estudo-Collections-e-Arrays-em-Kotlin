package one.digitalinnovation.collections

fun main() {

    //Declaramos 3 objetos da classe Funcionario
    val funcionario = Funcionario("João", 2000.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    //Instanciamos o repositorio criado para o exemplo
    val repositorio = Repositorio<Funcionario>()

    //Usamos a função create do repositorio para adicionar ao map
    //Passamos como chave o atributo nome do objeto funcionário e como valor o objeto inteiro funcionario
    repositorio.create(funcionario.nome, funcionario)
    repositorio.create(funcionario2.nome, funcionario2)
    repositorio.create(funcionario3.nome, funcionario3)

    //Como adicionamos o atributo nome da classe Funcionario como chave, podemos usar a função findById,
    //que recebe um parâmetro que representa a chave, para chamar o objeto que esta chave está associada.
    println(repositorio.findById(funcionario.nome))

    println("-------------------------")

    //Usamos a função findAll do repositorio para retornar os valores contidos em map e iteramos usando o forEach
    //para mostrar na tela
    repositorio.findAll().forEach { println(it) }

    println("-------------------------")

    //Usamos a função remove do repositorio para remover um valor do map passando a chave
    //Logo em seguida mostramos todos os valores que estão na coleção
    repositorio.remove(funcionario3.nome)
    repositorio.findAll().forEach { println(it) }


}