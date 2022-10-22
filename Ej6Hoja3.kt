fun main(){
    val mensaje: CharArray = generarMensaje("Introduce un texto:").toCharArray()
    val palabra: CharArray = generarPalabra("Ahora introduzca una palabra e indicare cuantas veces se repite en el texto:").toCharArray()
    println("${encontrarPalabra(mensaje, palabra)}")
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
 * funcion para crear una palabra
 * @param mensaje texto descriptivo del proceso a elaborar
 * @retrun la palabra escrita
 */
private fun generarPalabra(mensaje: String): String{
    println(mensaje)
    var texto = ""
    var contSiChar = 0
    var pos = 0
    val alfabeto = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTVWXYZ"
    val arrayAlfabeto: CharArray = alfabeto.toCharArray()
    var condicion = true
    do {
        texto = readln()
        val arrayTexto: CharArray = texto.toCharArray()
        do {
            for (i in arrayAlfabeto) {
                if (i == arrayTexto[pos]) {
                    contSiChar = contSiChar + 1
                }
            }
            pos = pos + 1
        }while(pos < texto.length)
        if(contSiChar < texto.length){
            condicion = false
            println("Esa no es 1 palabra, pruebe de nuevo:")
        }
    }while(condicion ==  false)
    return texto
}
/**
 * funcion para encontrar la palabra mas larga, imprimitla y decir el numero de caracteres
 * @param mensaje el texto que introducimos
 * @param palabra la palabra introducidad por el usuario
 * @return un mensaje imprimiendo la palabra y el numero de veces que se repite
 */
fun encontrarPalabra(mensaje: CharArray, palabra: CharArray): String{
    var contadorPal = 0
    var contadorCar = 0
    var contadorPosPal = 0
    var contadorPosMen = 0
    var condicion = false
    var caracter = ' '
    val alfabeto = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTVWXYZ"
    val arrayAlfabeto: CharArray = alfabeto.toCharArray()
    do {
        contadorCar = 0
        contadorPosPal = 0
        for (i in 0 until mensaje.size) {
            condicion = false
            caracter = palabra[contadorPosPal]
            var pos = i
            if (mensaje[i] == caracter) {
                contadorCar = contadorCar + 1
            }else{
                for (c in arrayAlfabeto) {
                    if(c == mensaje[pos]){
                    }else{
                        condicion = true
                    }
                }
                if(condicion == true) {
                    contadorPosPal = 0
                    if (contadorCar == palabra.size) {
                        contadorPal = contadorPal + 1
                    }
                    contadorCar = 0
                }
            }
            if (contadorCar > contadorPosPal && contadorCar < palabra.size){
                contadorPosPal = contadorPosPal + 1
            }
            contadorPosMen = contadorPosMen + 1
        }
    }while(contadorPosMen < mensaje.size)
    return """La palabra "${palabra.joinToString("")}" se repite $contadorPal veces."""
}
