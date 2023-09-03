fun main() {
    val contaPoupanca = ContaPoupanca("Homer Simpson", 2700.0, "12345", "001")
    val contaCorrente = ContaCorrente("Bart Simpson", 600.0, "67890", "002")

    contaPoupanca.aplicarJuros(10)
    contaCorrente.aplicarJuros(5)

    contaPoupanca.imprimirExtrato()
    println()
    contaCorrente.imprimirExtrato()
}