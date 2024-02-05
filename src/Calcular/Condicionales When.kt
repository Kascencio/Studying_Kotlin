package Calcular
 var acro: String = ""
fun main(){
    println("Bienvenido")
    println("Ingrese los datos requeridos para continuar")
    println("Nombre: ")
    var nombre = readLine()!!.toString()
    println("Edad: ")
    var edad = readLine()!!.toByte()
    println("Sexo: M o F")
    var sex = readLine()!!.toString().lowercase()
    if (sex == ("f")){
        acro = "Sra."
    }
    if (sex == ("m")){
        acro = "Sr."
    }
    else{
        println("No puede ser eres un perro")
    }

    println("Menu\n$acro $nombre Ingrese una opción")
    println("1. Acceso")
    println("2. Registro")
    println("3. Inicio")
    println("4. Salir")
    var respuesta = readLine()!!.toInt()
    when(respuesta){
        1 -> {
            println("Acceso")
            println("Nombre de Usuario: ")
            var user = readLine()!!.toString()
            println("Contraseña: ")
            var password = readLine()!!.toString()
        }
        2 -> {
            println("Registro")
        }
        3 -> {
            println("Inicio")
        }
        in(4..9) -> {
            println("Hasta luego")
        }
        else -> {
            println("Lo siento esa no es una Opción")
        }
    }

}