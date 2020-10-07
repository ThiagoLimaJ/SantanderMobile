class ContaPoupanca(numeroDaConta :Int,
                    saldo:Double,
                    val limite: Double) :ContaBancaria(numeroDaConta, saldo){

    override fun depositar(valor: Double) :Boolean{
        saldo +=valor
        println("Depósito efetuado.")
        return true
    }

    override fun sacar(valor: Double) :Boolean{
        if(valor<=(saldo+limite)){
            saldo-=valor
            println("Saque efetuado.")
            return true
        }else{
            println("Saldo e limite disponível insuficientes")
            return false
        }
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite da conta: $limite\n")
    }
}