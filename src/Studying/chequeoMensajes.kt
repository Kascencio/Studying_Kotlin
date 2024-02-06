package Studying
var nuevoMensaje:Boolean = true
fun main() {
    while (true) {

        if (nuevoMensaje) {
            println("Nuevo mensaje recibido")

            break

        } else {
            println("Esperando mensajes...")

            continue

        }
    }
}