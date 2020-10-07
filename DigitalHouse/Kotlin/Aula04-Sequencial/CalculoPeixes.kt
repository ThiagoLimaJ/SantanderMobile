fun main(){
    print("Digite o peso dos peixes: ")
    var pesoPeixes = readLine()!!.toFloat()
    var excesso = pesoPeixes - 50
    var multa = excesso * 4
    println("Excedeu " + "%.0f".format(excesso) + "Kg")
    println("O valor a ser pago é de R$ " + "%.2f".format(multa))
}