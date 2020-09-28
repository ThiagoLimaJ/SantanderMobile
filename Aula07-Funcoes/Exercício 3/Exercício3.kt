fun main(){
    var atleta1 = Atleta("Thiago", 10, 50)
    var atleta2 = Atleta("Alexandre", 4, 20)

    var provaCorrida = Prova(2,10)
    var provaPulo = Prova(3,10)
    var provaForca = Prova(6,30)

    println("Prova de Corrida")
    println("Nome do Atleta: ${atleta1.nome}")
    println("Atleta ${atleta1.nome} pode fazer a prova? ${provaCorrida.podeRealizar(atleta1)}")
    println("Nome do Atleta: ${atleta2.nome}")
    println("Atleta ${atleta2.nome} pode fazer a prova? ${provaCorrida.podeRealizar(atleta2)}")

    println("Prova de Pulo")
    println("Nome do Atleta: ${atleta1.nome}")
    println("Atleta ${atleta1.nome} pode fazer a prova? ${provaCorrida.podeRealizar(atleta1)}")
    println("Nome do Atleta: ${atleta2.nome}")
    println("Atleta ${atleta2.nome} pode fazer a prova? ${provaCorrida.podeRealizar(atleta2)}")

    println("Prova de Força")
    println("Nome do Atleta: ${atleta1.nome}")
    println("Atleta ${atleta1.nome} pode fazer a prova? ${provaCorrida.podeRealizar(atleta1)}")
    println("Nome do Atleta: ${atleta2.nome}")
    println("Atleta ${atleta2.nome} pode fazer a prova? ${provaCorrida.podeRealizar(atleta2)}")
}