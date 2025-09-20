fun main() {
    println("=== CUENTA DE AHORROS ===")
    val ahorro = CuentaAhorros(12000f, 5f)
    ahorro.mostrarInfo()

    println("\n>> Depósito de 2500")
    ahorro.depositar(2500f)
    ahorro.mostrarInfo()

    println("\n>> Retiro de 4000")
    ahorro.retirar(4000f)
    ahorro.mostrarInfo()

    println("\n>> Generando extracto mensual")
    ahorro.aplicarExtracto()
    ahorro.mostrarInfo()

    println("\n=== CUENTA CORRIENTE ===")
    val corriente = CuentaCorriente(6000f, 4f)
    corriente.mostrarInfo()
    println("\n>> Retiro de 9000 (entra en sobregiro)")
    corriente.retirar(9000f)
    corriente.mostrarInfo()

    println("\n>> Depósito de 5000 (reduce sobregiro)")
    corriente.depositar(5000f)
    corriente.mostrarInfo()

    println("\n>> Generando extracto mensual")
    corriente.aplicarExtracto()
    corriente.mostrarInfo()
}
