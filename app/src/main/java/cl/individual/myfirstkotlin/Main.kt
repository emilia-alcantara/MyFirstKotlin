package cl.individual.myfirstkotlin

fun main() {
    println("Ingresa el valor a convertir")
    val input = readLine()!!.toDouble()

    println("Resultados: ")

    //De Celsius a Fahrenheit: °F = 9/5 (°C) + 32
    val toFahrenheit = input * 9/5 + 32
    println("Celsius a Fahrenheit: $toFahrenheit")

   // De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
    val toKelvin = 5.0/9.0 * (input - 32) + 273.15
    println("Fahrenheit a Kelvin $toKelvin")

    // Kelvin a Celsius: °C = K - 273.15
    val toCelsius = input - 273.15
    println("Kelvin a Celsius: $toCelsius")
}