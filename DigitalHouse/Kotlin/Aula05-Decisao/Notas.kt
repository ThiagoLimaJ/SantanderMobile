fun main(){
    print("Por favor insira a primeira nota: ")
    var notaUm = readLine()!!.toDouble()
    print("Muito obrigado! Por favor insira a segunda nota: ")
    var notaDois = readLine()!!.toDouble()
    var media = (notaUm + notaDois) / 2
    if(media >= 7 && media < 10){
        println("Aprovado")
    } else if (media >= 10){
        println("Aprovado com Distinção")
    } else {
        println("Reprovado")
    }
}