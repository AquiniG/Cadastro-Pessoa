fun main() {

    println("Digite seu nome:")
    val nome = readln()

    println("Digite sua idade:")
    val idade = readln().toInt()

    println("Digite sua altura em metros (ex:1.75):")
    val alturaMetros = readln().toDouble()

    println("Digite o salário pretendido:")
    val salarioPretendido = readln().toFloat()

    println("Já trabalhou antes? (s/n)")
    val resposta = readln()
    var jaTrabalhou: Boolean = resposta == "s"

    val inicial = nome[0]



    println()
    println("---Cadastro Realizado---")
    println()
    println("Nome: $nome (${nome::class.simpleName})")
    println("Idade: $idade (${idade::class.simpleName})")
    println("Altura: ${alturaMetros}m (${alturaMetros::class.simpleName})")
    println("Salário pretendido: $salarioPretendido (${salarioPretendido::class.simpleName})")
    println("Já trabalhou antes? $jaTrabalhou (${jaTrabalhou::class.simpleName})")
    println("Inicial do nome: $inicial (${inicial::class.simpleName})")




}