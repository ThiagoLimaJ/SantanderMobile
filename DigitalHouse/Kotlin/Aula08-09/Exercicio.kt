fun main(){
    val banco :Banco = Banco()
    var entrada: Int = Int.MIN_VALUE

    do{
        entrada=0
        println("Insira uma das seguintes opções:")
        println("1.Criar conta \n2.Selecionar conta \n3.Remover conta \n4.Gerar relatório \n5.Finalizar")
        entrada= readLine()!!.toInt()
        when(entrada){
            1 ->{
                println("Deseja criar uma conta: \n 1.Poupança \n 2.corrente")
                entrada= readLine()!!.toInt()
                criarConta(entrada,banco)

            }
            2 ->{
                println("Informe o número da conta: ")
                entrada= readLine()!!.toInt()
                selecionarConta(entrada,banco)
            }
            3 ->{
                println("Informe o número da conta: ")
                entrada= readLine()!!.toInt()
                banco.remover(entrada)
            }
            4 -> banco.mostrarDados()
            5 -> break
        }

    }while(true)


}
fun criarConta(entrada:Int, banco :Banco){
    var numeroDaConta: Int= Int.MIN_VALUE
    var saldo :Double= Double.MIN_VALUE
    var taxaOuLimite :Double = Double.MIN_VALUE

    when(entrada){
        1->{
            println("Insira o numero da conta: ")
            numeroDaConta = readLine()!!.toInt()
            println("Deposite uma quantia: ")
            saldo = readLine()!!.toDouble()
            println("Insira o limite extra da conta: ")
            taxaOuLimite = readLine()!!.toDouble()
            val conta :ContaPoupanca = ContaPoupanca(numeroDaConta,saldo,taxaOuLimite)
            banco.registro.add(conta)
        }
        2->{
            println("Insira o numero da conta: ")
            numeroDaConta = readLine()!!.toInt()
            println("Deposite uma quantia: ")
            saldo = readLine()!!.toDouble()
            println("Insira o taxa administrativa da conta: ")
            taxaOuLimite = readLine()!!.toDouble()
            val conta :ContaCorrente = ContaCorrente(numeroDaConta,saldo,taxaOuLimite)
            banco.registro.add(conta)
        }
    }
}
fun selecionarConta(numeroDaConta: Int, banco : Banco) {
    var entrada: String = " "
    var resposta: Char = Char.MIN_VALUE
    var valor :Double = Double.MIN_VALUE
    var contaDestino :Int = Int.MIN_VALUE
    val result = banco.procurarConta(numeroDaConta)
    if (result != null) {
        do {
            println("Selecione uma das opções: \n a.Depositar \n b.Sacar \n c.Transferir \n d.Gerar relatório \n e.Retornar ao menu anterior")
            entrada = readLine()!!.toString().toLowerCase()
            resposta = entrada[0]
            when (resposta) {
                'a' ->{
                    println("Digite o valor para deposito: ")
                    valor = readLine()!!.toDouble()
                    result.depositar(valor)
                }
                'b' ->{
                    println("Digite o valor para sacar: ")
                    valor = readLine()!!.toDouble()
                    result.sacar(valor)
                }
                'c' ->{
                    println("Digite o valor a ser transferido: ")
                    valor = readLine()!!.toDouble()
                    println("Digite o número da conta destino: ")
                    contaDestino = readLine()!!.toInt()

                    var destino = banco.procurarConta(contaDestino)

                    if(destino != null) result.tranferir(valor,destino)
                    else println("Conta inexistente.")
                }
                'd' -> result.mostrarDados()
                'e' -> break
                else -> println("Opção inválida")
            }
        }while (true)

    } else println("Conta inexistente.")
}