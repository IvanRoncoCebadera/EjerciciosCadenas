fun main(){
    var mensaje = generarMensaje("Introduce un mensaje:")
    println(decirNumeroVocales(mensaje))
}
/**
 * funcion para crear un mensaje
 * @param mensaje texto descriptivo del proceso a elaborar
 * @retrun el texto escrito
 */
fun generarMensaje(mensaje: String): String{
    println(mensaje)
    var texto = readln()
    return texto
}

/**
 * funcion para decir el numero total de vocales de un texto
 * @param mensaje el texto del que se quiere contar el numero de vocales
 * @return el numero de vocels que tiene el parametro
 */
fun decirNumeroVocales(mensaje: String): String{
    var vocalesBuilder = StringBuilder()
    var contador = 0
    for(caracter: Char in mensaje){
        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ){
            contador = contador + 1
        }
    }
    vocalesBuilder.append("El número de vocales presente en ese texto es de: $contador")
    return vocalesBuilder.toString()
}