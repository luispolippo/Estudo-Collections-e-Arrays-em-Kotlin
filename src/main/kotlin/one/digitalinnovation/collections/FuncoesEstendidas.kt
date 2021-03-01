package one.digitalinnovation.collections

import java.math.BigDecimal

//Exemplos de Extension Functions
//neste exemplo estamos criando duas funções estendidas para serem usadas em Arrays do tipo BigDecimal

//Esta função soma todos os valores contidos num array de BigDecimal e retorna o resultado
fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

//Esta função retorna a média dos valores do array
//Primeiro ela varifica se o array está vazio, se estiver retorna 0
//Caso não esteja vazio, pegamos a soma de todos os valores usando a função somatoria, e dividimos pelo tamnho do array
fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()