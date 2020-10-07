fun iguais(stringUm:String,stringDois:String) = stringUm==stringDois

fun main(){
    println("Por favor digite a primeira string:")
    var stringUm = readLine()!!
    println("Muito obrigado! Por favor difite a segunda string:")
    var stringDois = readLine()!!

    println(iguais(stringUm,stringDois))
}