package Calcular

class Promedio {
    fun main() {

        val calificaciones = listOf(95, 87, 78, 92, 88)
        var suma = 0
        for (calificacion in calificaciones) {
            suma += calificacion
        }
        val promedio = suma / calificaciones.size
        println("El promedio de calificaciones es: $promedio")

    }
}