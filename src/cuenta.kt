open class Cuenta(
    protected var saldoActual: Float,
    protected var interesAnual: Float
) {
    protected var depositos: Int = 0
    protected var retiros: Int = 0
    protected var costoMensual: Float = 0f

    open fun depositar(monto: Float) {
        saldoActual += monto
        depositos++
    }

    open fun retirar(monto: Float) {
        if (monto <= saldoActual) {
            saldoActual -= monto
            retiros++
        } else {
            println("No hay suficiente dinero en la cuenta.")
        }
    }

    open fun calcularInteres() {
        val interes = (interesAnual / 12) * saldoActual / 100
        saldoActual += interes
    }

    open fun aplicarExtracto() {
        saldoActual -= costoMensual
        calcularInteres()
    }

    open fun mostrarInfo() {
        println("Saldo disponible: $saldoActual")
        println("Depósitos: $depositos")
        println("Retiros: $retiros")
        println("Interés anual: $interesAnual%")
        println("Costo mensual: $costoMensual")
    }
}
