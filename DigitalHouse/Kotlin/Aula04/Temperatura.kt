fun main(){
    print("Informe a temperatura em Fahrenheit ")
    var temperatura = readLine()!!.toFloat()
    var resultado = 5 * ((temperatura-32)/9)
    print("A temperatura em Celsius é $resultado °C")
}