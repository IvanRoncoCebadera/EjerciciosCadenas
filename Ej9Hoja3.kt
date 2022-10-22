fun main(){
    var mensaje = generarMensaje("Introduce un mensaje:")
    println(contarNumeroPalabras(mensaje.lowercase()))
}
/**
 * funcion para crear un mensaje
 * @param mensaje texto descriptivo del proceso a elaborar
 * @retrun el mensaje escrito
 */
private fun generarMensaje(mensaje: String): String{
    println(mensaje)
    var texto = readln()
    return texto
}

/**
 * funcion para dar el numero de veces que aparecen palabras
 * @param mensaje el mensaje sobre el que contaremos el numero de vocales
 * @return mensaje con numero de palabras en mensaje
 */
fun contarNumeroPalabras(mensaje: String): String {
    val alfabeto = "abcdefghijklmnñopqrstuvwxyz"
    var contadorPal = 0
    var pos = 0
    for (i in mensaje) {
        if (i in alfabeto) {
        } else {
            contadorPal = contadorPal + 1
        }
    }
    return "El texto tiene $contadorPal palabras"
}