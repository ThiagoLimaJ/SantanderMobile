class SessaoDeTreinamento(var ganhaExperiencia: Int) {
    fun treinarA(jogador: JogadordeFutebol){
        println("Experiência antes do treino é de ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += ganhaExperiencia
        println("Após o treino o jogaodor tem uma experiência de ${jogador.experiencia}")
    }
}