fun main(){
    println("Digite o valor do saque: ")
    var saque = readLine()!!.toInt()
    val minimo= 10
    val maximo= 600
    var notas = 0
    if(saque in minimo..maximo){
        notas= (saque/100).toInt()
        if(notas >= 1 ){
            println("$notas notas de 100 reais.")
        }
        saque -= (notas*100)
        notas = (saque/50).toInt()
        if(notas>=1){
            println("$notas notas de 50 reais.")
        }
        saque -= (notas*50)
        notas = (saque/10).toInt()
        if(notas>=1){
            println("$notas notas de 10 reais.")
        }
        saque -= (notas*10)
        notas = (saque/1).toInt()
        if(notas>=1){
            println("$notas notas de 01 real.")
        }
    }else{
        println("Valor inválido.")
    }


}