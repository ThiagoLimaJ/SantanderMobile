fun inteiro(numero:Int) = numero%2==0

fun main(){
    print("Por favor digite um número: ")
    var numero = readLine()!!.toInt()

    print(inteiro(numero))
}