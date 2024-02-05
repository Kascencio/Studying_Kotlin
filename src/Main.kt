import kotlin.math.round

var edad: Byte = 19
val nombre: String = "Kevin"
fun main() {
    println("Nombre: ")
    var nombre = readLine()!!.toString()
    println("Edad: " )
    var edad = readLine()!!.toDouble()
    var edadRound = round(edad).toInt()
    if (edadRound >= 18){
        println("Bienvenido $nombre")
    }
    else{
        println("Ese no es un numero")
    }

}