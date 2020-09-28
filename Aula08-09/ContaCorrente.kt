class ContaCorrente(numeroDaConta :Int,
                    saldo:Double,
                    val taxaDeOperacao: Double) :ContaBancaria(numeroDaConta, saldo){

    override fun depositar(valor: Double) :Boolean {
        if(valor+saldo>taxaDeOperacao){
            saldo+=valor
            saldo -= taxaDeOperacao
            println("Deposito efetuado.")
            return true
        }else{
            println("Saldo somado do deposito é inferior a taxa de operação")
            return false
        }
    }

    override fun sacar(valor: Double) :Boolean {
        if(valor<saldo+taxaDeOperacao){
            saldo -= valor-taxaDeOperacao
            println("Saque efetuado.")
            return true
        }else {
            println("Saldo insuficiente")
            return false
        }
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Ttaxa de operação: $taxaDeOperacao\n")
    }
}