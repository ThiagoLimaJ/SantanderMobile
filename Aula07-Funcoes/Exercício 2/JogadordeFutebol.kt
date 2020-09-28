class JogadordeFutebol(val nome: String, var energia: Int, var alegria: Int,
                       var gol: Int, var experiencia: Int)
{
    fun fazerGol(){
        energia -= 5
        alegria += 5
        gol++
        println("GOOOOL!")
    }

    fun correr(){
        energia -= 10
        println("Cansei")
    }
}