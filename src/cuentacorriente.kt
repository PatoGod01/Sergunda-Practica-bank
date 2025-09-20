class CuentaCorriente(
    saldoInicial: Float,
    interesAnual: Float
) : Cuenta(saldoInicial, interesAnual) {

    private var sobregiro: Float = 0f

    override fun retirar(monto: Float) {
        if (monto <= saldoActual) {
            saldoActual -= monto
        } else {
            sobregiro += (monto - saldoActual)
            saldoActual = 0f
        }
        retiros++
    }

    override fun depositar(monto: Float) {
        if (sobregiro > 0) {
            if (monto >= sobregiro) {
                val sobrante = monto - sobregiro
                sobregiro = 0f
                saldoActual += sobrante
            } else {
                sobregiro -= monto
            }
        } else {
            super.depositar(monto)
        }
    }

    override fun aplicarExtracto() {
        super.aplicarExtracto()
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Sobregiro actual: $sobregiro")
        println("Total movimientos: ${depositos + retiros}")
    }
}
