fun main(){
    var sim = 0
    println("Para os próximas perguntas por favor responder com 's' para sim e 'n' para não")
    println("Telefonou para a vítima?")
    var resposta = readLine()!!.toLowerCase()
    if (resposta == "s"){
        sim++
    }

    println("Esteve no local do crime?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s"){
        sim++
    }

    println("Mora perto da vítima?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s"){
        sim++
    }

    println("Devia para a vítima?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s"){
        sim++
    }

    println("Já trabalhou com a vítima?")
    resposta = readLine()!!.toLowerCase()
    if (resposta == "s"){
        sim++
    }

    if(sim == 2){
        println("Suspeito(a)")
    } else if(sim in 3..4){
        println("Cúmplice")
    } else if(sim == 5){
        println("Assassino")
    } else{
        println("Inocente")
    }
}