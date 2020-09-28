class Banco() :Imprimivel{
    val registro = ArrayList<ContaBancaria>()!!

    fun inserir(contaBancaria: ContaBancaria){

        registro.add(contaBancaria)
    }
    fun remover(numero: Int){
        var resultado = procurarConta(numero)
        if(resultado!=null){
            registro.remove(resultado)
            println("Conta removida com sucesso.")
        }else println("Conta informada inexistente.")

    }

    override fun mostrarDados() {
        registro.forEach{it.mostrarDados()}
    }
    fun procurarConta(numero: Int): ContaBancaria? {
        var conta = 0
        registro.forEach{i->
            conta= i.obterConta()
            if(conta==numero){
                return i
            }
        }
        return null
    }
}