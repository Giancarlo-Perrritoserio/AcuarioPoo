package acuario

fun construirAcuario() {
    // Creación de acuarios con diferentes tamaños
    val acuario1 = Acuario()
    acuario1.imprimirTamano()
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    // Usando el constructor secundario
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    // Estableciendo el volumen con el setter
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70  // Cambiar el volumen a 70 litros
    acuario7.imprimirTamano()

    // Creación de un acuario con dimensiones específicas
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()

}

fun main() {
    construirAcuario()
}
