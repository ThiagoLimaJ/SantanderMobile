fun main(){
    print("Por favor informe a quantidade de CDs que você possui: ")
    var quantidadeCd = readLine()!!.toInt()
    var valorCd = 0;
    for(i in 1..quantidadeCd){
        print("Por favor digite o valor do CD $i: ")
        valorCd += readLine()!!.toInt()
    }
    println("A coleção de Cds vale $valorCd")
}