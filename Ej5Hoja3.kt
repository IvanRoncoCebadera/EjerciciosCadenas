fun main(){
    var mensaje = generarMensaje("Introduce un mensaje:")
    println(encontrarPalabraMasLarga(mensaje))
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
 * funcion para encontrar la palabra mas larga, imprimirla y decir el numero de caracteres
 * @param mensaje el texto que introducimos
 * @return un mensaje imprimiendo la palabra más larga y su número de caracteres
 */
fun encontrarPalabraMasLarga(mensaje: String): String{
    val alfabeto = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTVWXYZ"
    val arrayAlfabeto: CharArray = alfabeto.toCharArray()
    var contadorCar = 0
    var contadorPos = 0
    var numCaracteres = 0
    var posPalabra = 0
    var caracter = ' '
    var verdad = false
    var pos = 0
    val arrayCaracteres: CharArray = mensaje.toCharArray()
    do {
        verdad = false
        caracter = arrayCaracteres[contadorPos]
        for (i in arrayAlfabeto) {
            if (i == caracter) {
                contadorCar = contadorCar + 1
                verdad = true
            }
        }
        if(verdad == false){
            if(contadorCar > numCaracteres){
                numCaracteres = contadorCar
                posPalabra = contadorPos - numCaracteres
            }
            contadorCar = 0
        }
        contadorPos = contadorPos + 1
    }while(contadorPos < mensaje.length)
    val arrayCaracteresResultado: CharArray = CharArray(numCaracteres)
    for(c in posPalabra until (posPalabra + numCaracteres)) {
        arrayCaracteresResultado[pos] = arrayCaracteres[c]
        pos = pos + 1
    }
    return "La palabra más larga es ${arrayCaracteresResultado.joinToString("")}, y tiene $numCaracteres letras."
}