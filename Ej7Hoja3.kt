fun main(){
    val numero: CharArray = generarNumero("Por favor, introduzca un numero de telefono con los 11 numeros reglamentarios, por ejemplo: 34555332211").toCharArray()
    val telefono = generarNumeroTelefono(numero)
    println("El número de telefono introducido es: $telefono")
}
/**
 * funcion para introducir un numero
 * @param mensaje texto descriptivo del proceso a elaborar
 * @retrun el numero escrito
 */
private fun generarNumero(mensaje: String): String{
    println(mensaje)
    var numero = ""
    do {
        numero = readln()
        if(numero.length < 11){
            println("Ese numero no vale. Preube de nuevo:")
        }
    }while(numero.length < 11)
    return numero
}
/**
 * funcion para crear el numero de telefono escrito como se pide en el enunciado
 * @param numero vector en el que esta escrito el numero de telefono
 * @retrun el numero escrito como se pide en el enunciado
 */
fun generarNumeroTelefono(numero: CharArray): String{
    var telefonoBuilder = StringBuilder()
    for(i in numero.indices){
        if(i == 0){
            telefonoBuilder.append("(+${numero[i]}")
        }
        if(i == 1){
            telefonoBuilder.append("${numero[i]})")
        }
        if(i == 2){
            telefonoBuilder.append("-${numero[i]}")
        }
        if(i == 3 || i == 4){
            telefonoBuilder.append("${numero[i]}")
        }
        if(i == 5){
            telefonoBuilder.append("-${numero[i]}")
        }
        if(i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 5){
            telefonoBuilder.append("${numero[i]}")
        }
    }
    return telefonoBuilder.toString()
}