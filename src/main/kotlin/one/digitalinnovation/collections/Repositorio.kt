package one.digitalinnovation.collections

//Criação de uma classe generica usada para repositorio
class Repositorio<T> {

    //Intanciamos um mutableMapOf que recebe uma key do tipo String e como value um tipo que será passado para a classe
    private val map = mutableMapOf<String, T>()

    //Função para adicionar valor no map
    fun create(id:String, value:T){
        map[id] = value
    }

    //Função para remover valor do map passando como parâmetro a chave
    fun remove(id: String) = map.remove(id)

    //Função para retornar o valor que está associado a chave passada
    fun findById(id: String) = map[id]

    //Função para retornar todos os valores que estão no map
    fun findAll() = map.values
}