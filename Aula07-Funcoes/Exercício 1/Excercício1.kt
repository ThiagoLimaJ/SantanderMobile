fun main(){
    var cliente1: Cliente = Cliente("Thiago","Lima")
    var cliente2: Cliente = Cliente("Alexandre","Lima")
    var conta1: Conta = Conta(1, 2000.0,cliente1)
    var conta2: Conta = Conta(2,2500.0,cliente2)

    conta1.depositar(200.0)
    conta2.depositar(500.0)

    conta1.sacar(300.0)
    conta2.sacar(1200.0)
}