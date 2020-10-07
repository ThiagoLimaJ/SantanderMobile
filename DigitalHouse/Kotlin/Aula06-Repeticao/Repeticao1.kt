fun main(){
    var numero = Int.MIN_VALUE
    for(c in 1..5){
        print("Favor digitar um número: ")
        var numero2 = readLine()!!.toInt()
        if(numero2 > numero){
            numero = numero2
        }
    }
    println(numero)
}