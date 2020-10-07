fun main(){
    print("Digite a nota 1: ")
    var nota1 = readLine()!!.toFloat()
    print("Digite a nota 2: ")
    var nota2 = readLine()!!.toFloat()
    print("Digite a nota 3: ")
    var nota3 = readLine()!!.toFloat()
    print("Digite a nota 4: ")
    var nota4 = readLine()!!.toFloat()
    var resultado = (nota1 + nota2 + nota3 + nota4) / 4
    print("A média é $resultado")
}