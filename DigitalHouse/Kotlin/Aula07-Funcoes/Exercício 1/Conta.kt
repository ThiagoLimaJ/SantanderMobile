class Conta (val numeroDaConta: Int, var saldo: Double, val titular: Cliente){

    fun depositar(valor: Double){
        saldo += valor
        println("Deposito realizado com sucesso, saldo em conta de $saldo reais.")
    }

    fun sacar(valor: Double){
        if(valor>=saldo){
            println("Saldo Insuficiente!")
        } else{
            saldo -= valor
            println("Saque realizado com sucesso, saldo em conta de $saldo reais.")
        }
    }
}