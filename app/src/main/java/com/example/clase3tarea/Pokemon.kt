package com.example.clase3tarea

class Pokemon {
}
fun main(){

    var pokemon = readLine()!!.toString()




    when (pokemon) {

        "pikachu" -> println("Tipo Electrico")
        "charizard" -> println("Tipo Fuego")
        "blastoise" -> println("Tipo Agua")
        "cubone" -> println("Tipo Tierra")
        "snorlax" -> println("Tipo Normal")
        "gengar" -> println("Tipo Fantasma")
        else -> println("unknown")


    }

}