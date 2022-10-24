fun main(){
    var palabra = generarPalabra("Por favor usuaro 1, introduzca una palabra para jugar al ahorcado con el usuario 2.")
    val palabraA: CharArray = palabra.toCharArray()
    var resultado = generarResultado(palabraA)
    println(resultado)
}

/**
 * funcion para escribir una sola palbra que solo contenga caracters
 * @param mensaje texto informativo de la accion ha realizar
 * @return la palabra escrita
 */
private fun generarPalabra(mensaje: String): String{
    println(mensaje)
    var condicion = true
    val alfabeto = "abcdefghijklmnñopqrstuvwxyz"
    var texto = ""
    var cont = 0
    do {
        condicion = true
        texto = readln().lowercase()
        for(i in texto){
            cont = 0
            while(i != alfabeto[cont] && cont < alfabeto.length - 1){
                cont = cont + 1
            }
            if(cont >= alfabeto.length - 1){
                condicion = false
            }
        }
        if(condicion == false){
            println("Esa no es una palabra. Prueba de nuevo:")
        }
    }while(condicion == false)
    return texto
}
/**
 * funcion para decir el resultado del juega, ganar o perder
 * @param palabra vector del tipo Char de la palabra generada anteriormente
 * @return un mensaje en el que se indica si se gano o se perdio
 */
fun generarResultado(palabra: CharArray): String{
    val averiguar: CharArray = jugar(palabra)
    var resultado = StringBuilder()
    var condicion = true
    for(i in averiguar.indices){
        if(averiguar[i] != palabra[i]){
            condicion = false
        }
    }
    if(condicion == true){
        resultado.append("Usted ha ganado, la palabra oculta era: ${escribirCharArray(palabra)}")
    }else{
        resultado.append("Usted ha perdido, la palabra oculta era: ${escribirCharArray(palabra)}")
    }
    return resultado.toString()
}
/**
 * funcion para escribir el vector como palabra
 * @param array el vector que habra que escribir como palabra
 * @return la palabra
 */
fun escribirCharArray(array: CharArray): String{
    var mensaje = StringBuilder()
    for(i in array){
        mensaje.append("$i")
    }
    return mensaje.toString()
}
/**
 * funcion para reescribir sobra el vector al que tiene acceso a ver el jugador
 * @param palabra vector del tipo Char de la palabra generada anteriormente
 * @return el vector reescrito o sin cambiar, depende de si acerto una letra o no
 */
fun jugar(palabra: CharArray): CharArray{
    var intentos = 0
    var letra = ""
    var condicion = true
    val array: CharArray = CharArray(palabra.size)
    do{
        condicion = true
        letra = generarletra("Por favor usuario2, introduzca una letra:")
        for(i in palabra.indices){
            if(palabra[i] == letra[0]){
                array[i] = palabra[i]
            }
        }
        intentos = intentos + 1
        println("Con respecto a la letra $letra, las posibles casillas se quedan como ${escribirCharArray(array)}, y te quedan ${7 - intentos} intentos. ")
        for(i in array.indices){
            if(array[i] != palabra[i]){
                condicion = false
            }
        }
    }while(intentos < 7 && condicion == false)
    return array
}
/**
 * funcion para escribir una sola letra que solo contenga caracters
 * @param mensaje texto informativo de la accion ha realizar
 * @return la letra escrita
 */
fun generarletra(mensaje: String): String{
    println(mensaje)
    var condicion = true
    val alfabeto = "abcdefghijklmnñopqrstuvwxyz"
    var texto = ""
    do {
        condicion = false
        texto = readln().lowercase()
        for(i in alfabeto){
            if(i == texto[0] && texto.length == 1){
                condicion = true
            }
        }
        if(condicion == false){
            println("Esa no es una letra. Prueba de nuevo:")
        }
    }while(condicion == false)
    return texto
}
