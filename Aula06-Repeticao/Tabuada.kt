fun main(){
    println("Por favor informe qual o número da tabuada a ser mostrado:\nLembrando, somente as tabuadas de 1 até 10 ")
    var tabuada = readLine()!!.toInt()
    for(i in 1..10){
        var numero = i * tabuada
        println("$tabuada x $i = $numero")
    }
}