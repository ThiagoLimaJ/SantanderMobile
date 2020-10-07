fun main(){
    print("Por favor informe o primeiro número: ")
    var numeroUm = readLine()!!.toInt()
    print("Muito obrigado! Por favor informe o segundo número: ")
    var numeroDois = readLine()!!.toInt()
    var soma = numeroUm + numeroDois
    println("A soma dos dois números é $soma")
}