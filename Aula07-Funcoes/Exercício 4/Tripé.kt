class Tripé(var dobrado: Boolean, val alturaMinima: Int, val alturaMaxima: Int,
                                var alturaAtual: Int)
{
    fun definirAltura(novaAltura: Int){
        alturaAtual = novaAltura
    }

    fun dobrar(){
        dobrado = true
    }

    fun desdobrar(){
        dobrado = false
    }

    fun guardar(){
        if(dobrado && alturaAtual == alturaMinima){
            println("Tripé guardado!")
        } else {
            println("Tripé não pôde ser guardado! Favor verificar altura e se ele está dobrado")
            println("Para que ele possa ser guardado ele deve estar com altura atual deve ser a menor possível.")
        }
    }

    fun prontoparaGuardar(){
        if(dobrado && alturaAtual == alturaMinima){
            println("Tripé pdoe ser guardado!")
        } else {
            println("Tripé não pode ser guardado! Favor verificar altura e se ele está dobrado")
            println("Para que ele possa ser guardado ele deve estar com altura atual deve ser a menor possível.")
        }
    }

    fun usar(){
        if(!dobrado && alturaAtual >= (alturaMaxima/2)){
            println("Tripé usado!")
        } else {
            println("Tripé não pôde ser usado! Favor verificar altura e se ele está desdobrado")
            println("Para que ele possa ser usado ele deve estar com altura atual superior a metade da altura máxima.")
        }
    }

    fun prontoParaUsar(){
        if(!dobrado && alturaAtual >= (alturaMaxima/2)){
            println("Tripé pode ser usado!")
        } else {
            println("Tripé não pode ser usado! Favor verificar altura e se ele está desdobrado")
            println("Para que ele possa ser usado ele deve estar com altura atual superior a metade da altura máxima.")
        }
    }
}