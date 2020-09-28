class Prova(val dificuldade: Int, val energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean{
        if(atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria){
            atleta.energia -= energiaNecessaria
            return true
        } else return false
    }
}