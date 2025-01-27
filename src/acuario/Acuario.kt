package acuario

import kotlin.math.PI

open class Acuario(open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {

    init {
        println("inicializando acuario")
    }

    // Propiedad `volumen` con getter y setter
    open var volumen: Int
        get() = ancho * alto * largo / 1000  // Calcula el volumen en litros
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    // Propiedad `forma`
    open val forma: String = "rectángulo"

    // Propiedad `agua` que devuelve el 90% del volumen
    open var agua: Double = 0.0
        get() = volumen * 0.9

    // Constructor secundario
    constructor(numeroDePeces: Int) : this() {
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    // Método para imprimir el tamaño
    open fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        // Imprimir el volumen calculado y la cantidad de agua
        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }


}


// Subclase que representa un tanque cilíndrico
class TanqueTorre (override var alto: Int, var diametro: Int): Acuario(alto = alto, ancho = diametro, largo = diametro) {
    override var volumen: Int
        // área elíptica = π * r1 * r2
        get() = (ancho/2 * largo/2 * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / (ancho/2 * largo/2)).toInt()
        }

    override var agua = volumen * 0.8
    override val forma = "cilindro"
}
