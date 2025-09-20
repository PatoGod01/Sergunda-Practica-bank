class CuentaAhorros(
    saldoInicial: Float,
    interesAnual: Float
) : Cuenta(saldoInicial, interesAnual) {

    private var activa: Boolean = saldoActual >= 10000

    override fun depositar(monto: Float) {
        if (activa) {
            super.depositar(monto)
        } else {
            println("Cuenta inactiva: no se puede depositar.")
        }
    }

    override fun retirar(monto: Float) {
        if (activa) {
            super.retirar(monto)
        } else {
            println("Cuenta inactiva: no se puede retirar.")
        }
    }

    override fun aplicarExtracto() {
        if (retiros > 4) {
            costoMensual += (retiros - 4) * 1000
        }
        super.aplicarExtracto()
        activa = saldoActual >= 10000
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Cuenta activa: $activa")
        println("Total movimientos: ${depositos + retiros}")
    }
}
