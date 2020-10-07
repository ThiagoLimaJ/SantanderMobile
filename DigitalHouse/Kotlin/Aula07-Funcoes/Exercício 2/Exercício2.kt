fun main(){
    var jogador1  = JogadordeFutebol("Thiago", 100, 5,0,1)
    var jogador2  = JogadordeFutebol("Alexandre", 90, 3,0,0)

    var treino = SessaoDeTreinamento(3)
    treino.treinarA(jogador1)
    treino.treinarA(jogador2)
}