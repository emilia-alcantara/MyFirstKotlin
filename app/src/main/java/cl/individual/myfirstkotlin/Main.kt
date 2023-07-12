package cl.individual.myfirstkotlin

fun main() {
    println("Ingresa el valor a convertir")
    val input = readLine()!!.toDouble()

    //De Celsius a Fahrenheit: °F = 9/5 (°C) + 32
    val fahrenheitFromCelsius = input * 9/5 + 32
    println("Celsius a Fahrenheit: $fahrenheitFromCelsius")

   // De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
    val kelvinFromFahren = 5.0/9.0 * (fahrenheitFromCelsius - 32) + 273.15
    println("Fahrenheit a Kelvin $kelvinFromFahren")

    // Kelvin a Celsius: °C = K - 273.15
    val celsiusFromKelvin = kelvinFromFahren - 273.15
    println("Kelvin a Celsius: $celsiusFromKelvin")
}