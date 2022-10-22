fun main(){
    val numero = generarNumero("Introduce un número:")
    val numeroOperar: Int = numero.toInt()
    var res = numeroOperar + 34
    println(res)
}
/**
 * funcion para introducir un numero
 * @param mensaje texto descriptivo del proceso a elaborar
 * @retrun el numero escrito
 */
private fun generarNumero(mensaje: String): String{
    println(mensaje)
    var numero = ""
    val numeros: CharArray = charArrayOf('0','1','2','3','4','5','6','7','8','9')
    val signos: CharArray = charArrayOf('+','-')
    var condicion = true
    do {
        numero = readln()
        condicion = true
        for (i in numero.indices) {
            if (i == 0) {
                if (numero[i] in numeros || numero[i] in signos) {
                } else {
                    condicion = false
                }
            } else {
                if (numero[i] in numeros) {
                } else {
                    condicion = false
                }
            }
        }
        if(condicion == false){
            println("Ese numero introducido no vale, prueba de nuevo:")
        }
    }while(condicion == false)
    return numero
}