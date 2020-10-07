fun main(){
    print("Quantidade de notas: ")
    var n = readLine()!!.toInt()
    var soma = 0.0
    for(c in 1..n){
        print("Favor entrar com a nota $c ")
        var nota = readLine()!!.toDouble()
        soma += nota
    }
    var media = soma / n
    print(media)
}