fun main(){
    var conta1 = ContaCorrente(123,10.0,5.0)
    var conta2 = ContaPoupanca(321,50.0,200.0)

    val relatorio = Relatorio()

    conta1.depositar(200.0)
    conta2.depositar(10.0)

    conta1.sacar(205.0)
    conta2.sacar(260.1)

    relatorio.gerarRelatorio(conta1)
    relatorio.gerarRelatorio(conta2)

}