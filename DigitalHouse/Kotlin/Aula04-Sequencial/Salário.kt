fun main(){
    print("Quanto vale sua hora? ")
    var valorHora = readLine()!!.toFloat()
    print("Quantas horas você trabalhou? ")
    var horasTrabalhadas = readLine()!!.toFloat()
    var resultado =valorHora * horasTrabalhadas
    print("Você receberá R$ " + "%.2f".format(resultado))
}