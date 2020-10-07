fun main(){
    print("Favor digitar primeiro numero: ")
    var numeroUm = readLine()!!.toInt()
    print("Favor digitar segundo numero: ")
    var numeroDois = readLine()!!.toInt()
    for (c in numeroUm..numeroDois){
        println(c)
    }
}