import java.lang.ArithmeticException
import java.lang.Exception

class CalculoMatematico() {
    fun divisao(numero1: Int,numero2: Int): Int {
        if(numero2==0){
            throw ArithmeticException("Operação não pode ser realizada")
        }else{
            return numero1 / numero2
        }
    }
}