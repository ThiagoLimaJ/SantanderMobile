fun main(){
    var palio = Veiculo("Fiat","Palio",2010,"Vermelho",10000.0)
    var cliente = Cliente1("Thiago", "Lima",55668822)
    var venda = Concessionária()

    venda.registrarVenda(palio,cliente,12500.00)
}