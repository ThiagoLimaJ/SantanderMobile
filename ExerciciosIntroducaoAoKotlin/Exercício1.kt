import kotlin.math.max

fun maiorNumero(numeroUm:Int,numeroDois:Int,numeroTres:Int) = max(max(numeroUm,numeroDois),numeroTres)

fun main(){
    println("Por favor digite o primeiro número: ")
    var numeroUm = readLine()!!.toInt()
    println("Por favor digite o segundo número: ")
    var numeroDois = readLine()!!.toInt()
    println("Por favor digite o terceiro número: ")
    var numeroTres = readLine()!!.toInt()

    println("O maior numero é " + maiorNumero(numeroUm,numeroDois,numeroTres))
}

