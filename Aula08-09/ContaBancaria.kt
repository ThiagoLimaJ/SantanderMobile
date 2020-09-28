abstract class ContaBancaria( private val numeroDaConta :Int, protected var saldo : Double) :Imprimivel {

    abstract fun sacar(valor: Double) :Boolean
    abstract fun depositar(valor: Double) :Boolean
    fun obterConta() : Int = numeroDaConta

    fun tranferir(valor: Double, conta:ContaBancaria){
        val saldoContaOrigem = saldo
        if (!sacar(valor) || !conta.depositar(valor)) {
            saldo = saldoContaOrigem
            println("Operação cancelada")
        }
    }

    override fun mostrarDados() {
        println("\n Número da conta: $numeroDaConta")
        println("Saldo: $saldo")
    }
}