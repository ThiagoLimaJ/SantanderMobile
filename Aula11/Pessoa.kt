class Pessoa(val nome: String,val Rg: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (Rg != other.Rg) return false

        return true
    }

    override fun hashCode(): Int {
        return Rg
    }
}