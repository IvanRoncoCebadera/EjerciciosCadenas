fun main(){
    val texto1 = generarArrayMensaje("Introduce un mensaje:")
    val texto2 = generarArrayMensaje("Introduce un mensaje:")
    compararLongitud(texto1, texto2)
    println(compararIgualdad(texto1, texto2))
}

/**
 * funcion para crear un mensaje
 * @param mensaje texto descriptivo del proceso a elaborar
 * @retrun el texto escrito
 */
fun generarArrayMensaje(mensaje: String): String{
    println(mensaje)
    var texto = readln()
    return texto
}
/**
 * funcion para comprobar la longitud de unos mensajes
 * @param texto1 primero de los menajes a comprar
 * @param texto2 segundo de los menajes a comprar
 */
fun compararLongitud(texto1: String, texto2: String){
    if(texto1.length == texto2.length){
        println("El texto 1 tiene la misma longitud que el 2.")
    }else{
        println("El texto 1 NO tiene la misma longitud que el 2.")
    }
}
/**
 * funcion para comprobar la igualdad de unos mensajes
 * @param texto1 primero de los menajes a comprar
 * @param texto2 segundo de los menajes a comprar
 * @retrun texto que dice si son o no iguales
 */
fun compararIgualdad(texto1: String, texto2: String): String{
    val arrayChar: CharArray = texto2.toCharArray()
    var i = 0
    if(texto1.length == texto2.length){
        for(caracter: Char in texto1){
            var caracter2: Char = arrayChar[i].toChar()
            i = i + 1
            if(caracter == caracter2){
            }else{
                return "No son iguales"
            }
        }
    }else{
        return "No son iguales"
    }
    return "Si son iguales"
}