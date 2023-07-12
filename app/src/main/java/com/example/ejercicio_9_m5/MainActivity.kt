package com.example.ejercicio_9_m5

fun main() {

    println("Ingresa el Valor")
    val input = readLine()!!.toDouble()

    val fahrenheit = (9.0/5.0) * input + 32
    println("El valor Fahrenheit es : " + fahrenheit)

    val kelvin = input +273.15
    println("El valor Kelvin es: " + kelvin)

    val fahrenheitToKelvin = 5.0/9.0 *(fahrenheit -32)+273.15
    println("El valor Fahrenhoit a Kelvin es: "+ fahrenheitToKelvin)



}


    fun isLetters(string: String): Boolean {
        return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
    }

