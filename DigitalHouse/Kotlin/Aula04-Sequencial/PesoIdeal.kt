fun main(){
    print("Digite a altura: ")
    var altura = readLine()!!.toFloat()
    var homem = (72.7 * altura) - 58
    var mulher = (62.1 * altura) - 44.7
    println("Para homens: " + "%.2f".format(homem))
    println("Para mulheres: " + "%.2f".format(mulher))
}