fun maiorQue(numeroA:Int,numeroB:Int,numeroC:Int,numeroD:Int) = numeroA > numeroC && numeroA > numeroD || numeroB > numeroC && numeroB > numeroD

fun main(){
    print("Por favor insira o primeiro número: ")
    var numeroA = readLine()!!.toInt()
    print("Por favor insira o segundo número: ")
    var numeroB = readLine()!!.toInt()
    print("Por favor insira o terceiro número: ")
    var numeroC = readLine()!!.toInt()
    print("Por favor insira o quarto número: ")
    var numeroD = readLine()!!.toInt()

    print(maiorQue(numeroA,numeroB,numeroC,numeroD))
}