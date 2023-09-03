abstract class Conta(
    val cliente: String,
    var saldo: Double,
    val numero: String,
    val agencia: String
) : Extrato {

    abstract fun depositar(valor: Double)
    abstract fun retirar(valor: Double)
    abstract fun transferir(valor: Double, destino: Conta)

    override fun imprimirExtrato() {
        val saldoFormatado = String.format("%.2f", saldo)
        println("Tipo de Conta..: ${this.javaClass.simpleName}")
        println("Conta/Agencia..: $numero/$agencia")
        println("Cliente........: $cliente")
        println("Saldo..........: R$ $saldoFormatado")
    }
}