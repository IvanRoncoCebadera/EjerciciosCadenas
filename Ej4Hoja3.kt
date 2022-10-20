fun main(){
    var mensaje = generarMensaje("Introduce un mensaje:")
    println(decirNumeroVocales(mensaje))
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
 * funcion para generar el carcater con el que comprobaremos mas adelante el mensaje
 * @param mensaje un texto descriptivo de que hay que hacer
 * @return la letra clave
 */
fun generarCaracter(mensaje: String): Char{
    println(mensaje)
    var verdadero = false
    var caracArray = ' '
    var caracter: Char = ' '
    val alfabeto = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ"
    var arrayChar: CharArray = CharArray(1)
    do {
        arrayChar = readln().toCharArray()
        for (caracArray in alfabeto) {
            if (caracArray == arrayChar[0]) {
                caracter = arrayChar[0]
                verdadero = true
            }
        }
        if(verdadero == false) {
            println("Ese caracter no es valido, pruebe de nuevo.")
        }
    }while(verdadero == false)
    return caracter
}

/**
 * funcion para decir el numero total de veces que aparece una letra clave en el mensaje
 * @param mensaje el texto del que se quiere contar el numero de veces que encontramos la letra clave
 * @return el numero de vocels que tiene el parametro
 */
private fun decirNumeroVocales(mensaje: String): String{
    var vocalesBuilder = StringBuilder()
    var contador = 0
     var caracter2: Char = generarCaracter("Introduzca una letra porfavor:")
    for(caracter: Char in mensaje){
        if(caracter == caracter2){
            contador = contador + 1
        }
    }
    vocalesBuilder.append("El número de vocales presente en ese texto es de: $contador")
    return vocalesBuilder.toString()
}