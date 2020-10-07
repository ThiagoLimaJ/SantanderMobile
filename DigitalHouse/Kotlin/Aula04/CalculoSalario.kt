fun main(){
    print("Informe qual o seu salário por hora: ")
    var salarioHora = readLine()!!.toFloat()
    print("Informe a quantidade de horas trabalhadas: ")
    var qtdeHorasTrabalhadas = readLine()!!.toFloat()
    var salarioBruto = salarioHora * qtdeHorasTrabalhadas
    var valorIR = salarioBruto * 11 / 100
    var valorINSS = salarioBruto * 8 / 100
    var valorSindicato = salarioBruto * 5 / 100
    var salarioLiquido = salarioBruto - valorIR - valorINSS - valorSindicato
    println("+ Salário Bruto   : R$ " + "%.2f".format(salarioBruto))
    println("- IR (11%)        : R$ " + "%.2f".format(valorIR))
    println("- INSS (8%)       : R$ " + "%.2f".format(valorINSS))
    println("- Sindicato (5%)  : R$ " + "%.2f".format(valorSindicato))
    println("= Salário Líquido : R$ " + "%.2f".format(salarioLiquido))
}