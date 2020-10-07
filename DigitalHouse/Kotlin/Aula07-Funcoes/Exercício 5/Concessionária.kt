class Concessionária {
    var registroVendas = ArrayList<Venda>()

    fun registrarVenda(veiculo:Veiculo, cliente: Cliente1, valor:Double){
        var venda = Venda(cliente,veiculo,valor)
        registroVendas.add(venda)

        println(registroVendas)
    }
}