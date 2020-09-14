fun main(){
    println("Por favor digite seu sexo de acordo com tabela abaixo:\nF - Feminino\nM - Masculino")
    var sexo = readLine()!!.toLowerCase()
    if(sexo == "f"){
        println("Feminino")
    } else if(sexo == "m"){
        println("Masculino")
    } else{
        println("Sexo Inválido")
    }
}