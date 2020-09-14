fun main(){
    print("Por favor informe um número: ")
    var numero = readLine()!!.toInt()
    if(numero % 2 == 0){
        println("É Par")
    } else{
        println("É Impar")
    }
}