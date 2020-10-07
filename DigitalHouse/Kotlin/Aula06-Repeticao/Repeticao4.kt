fun main(){
    print("Favor digite seu nome: ")
    var nome = readLine()!!
    while(nome.length < 3){
        print("Nome deve ter mais de 3 caracteres.")
        print("Favor digite seu nome: ")
        nome = readLine()!!
    }
    print("Favor digite sua idade: ")
    var idade = readLine()!!.toInt()
    while(idade < 0 || idade > 150){
        print("Idade deve ser entre 0 e 150.")
        print("Favor digite sua idade: ")
        idade = readLine()!!.toInt()
    }
    print("Favor digite seu salário: ")
    var salario = readLine()!!.toDouble()
    while(salario <= 0){
        print("Salario deve ser maior que zero.")
        print("Favor digite seu salario: ")
        salario = readLine()!!.toDouble()
    }
    print("Favor digite seu sexo: ")
    var sexo = readLine()!!.toLowerCase()
    while(true){
        print("Sexo deve ser f ou m.")
        print("Favor digite seu sexo: ")
        sexo = readLine()!!.toLowerCase()
        if (sexo == "f" || sexo == "m"){
            break
        }
    }
    print("Favor digite seu estado civil: ")
    var estadoCivil = readLine()!!.toLowerCase()
    while(true){
        print("SEstado Civil deve ser s, c, v ou d.")
        print("Favor digite seu estado civil: ")
        estadoCivil = readLine()!!.toLowerCase()
        if (estadoCivil == "s" || estadoCivil == "c" || estadoCivil == "v" || estadoCivil == "d"){
            break
        }
    }
}