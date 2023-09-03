class ContaPoupanca(
    cliente: String,
    saldo: Double,
    numero: String,
    agencia: String
) : Conta(cliente, saldo, numero, agencia) {

    override fun depositar(valor: Double) {
        saldo += valor
    }

    override fun retirar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Saldo insuficiente")
        }
    }

    override fun transferir(valor: Double, destino: Conta) {
        if (valor <= saldo) {
            saldo -= valor
            destino.depositar(valor)
        } else {
            println("Saldo insuficiente para realizar a transferência")
        }
    }

    fun aplicarJuros(dias: Int) {
        val taxaDeJuros = 0.003 // 0,3% de juros ao dia
        saldo *= Math.pow(1 + taxaDeJuros, dias.toDouble())
    }
}