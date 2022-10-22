fun main(){
    var mensaje = generarMensaje("Introduce un mensaje:")
    println(contarNumeroVocales(mensaje.lowercase()))
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
 * funcion para dar el porcentaje de participacion de cada vocal, y adicionalmente el numero de veces que aparece cada una
 * @param mensaje el mensaje sobre el que contaremos el numero de vocales
 * @return mensaje con numero de vocales y porcentaje de participacion de las mismas
 */
fun contarNumeroVocales(mensaje: String): String{
    var contA = 0
    var contE = 0
    var contI = 0
    var contO = 0
    var contU = 0
    for(i in mensaje){
        if(i == 'a'){
            contA = contA + 1
        }
        if(i == 'e'){
            contE = contE + 1
        }
        if(i == 'i'){
            contI = contI + 1
        }
        if(i == 'o'){
            contO = contO + 1
        }
        if(i == 'u'){
            contU = contU + 1
        }
    }
    return "En el mensaje hay $contA 'a', $contE 'e', $contI 'i', $contO 'o' y $contU 'u', y por ende la frecuencia de aparicion de las vocales son: ${generarFrecuenciaAparicion(contA, contE, contI, contO, contU)}"
}

/**
 * funcion para dar el porcentaje de participacion de cada vocal
 * @param a numero de veces que aparece la 'a'
 * @param e numero de veces que aparece la 'e'
 * @param i numero de veces que aparece la 'i'
 * @param o numero de veces que aparece la 'o'
 * @param u numero de veces que aparece la 'u'
 * @return mensaje con el porcentaje de participacion de las vocales
 */
fun generarFrecuenciaAparicion(a: Int, e: Int, i: Int, o: Int, u: Int): String{
    var total = (a + e + i + o + u)
    var frecuenciaA = ((a * 100)/total)
    var frecuenciaE = ((e * 100)/total)
    var frecuenciaI = ((i * 100)/total)
    var frecuenciaO = ((o * 100)/total)
    var frecuenciaU = ((u * 100)/total)
    return "$frecuenciaA% de 'a', $frecuenciaE% de 'e', $frecuenciaI% de 'i', $frecuenciaO% de 'o'y $frecuenciaU% de 'u'."
}