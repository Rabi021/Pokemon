package com.example.lossimpsons

class Springfield {
}
fun main(){
    // Punto 1  Hacer una lista exclusiva para niños y otra para adultos
    var niños = mutableListOf("Bart", "Lisa", "Maggie", "Milhouse", "Rod", "Tod", "Ralph", "Nelson")

    var adultos = mutableListOf("Homero", "Marge", "Patty", "Selma", "Lenny", "Carl", "Señor Burns",
                               "Smithers", "Ned", "Apu", "Moe", "Seymour")
    println(niños)
    println(adultos)

    // Punto 2 invertir la lista de niños
    println(niños.reversed())

    //Punto 3 Preguntar si la lista de niños contiene a Bart,Lisa y Nelson si es asi avisar por consola si no agregarlos
    if (niños.containsAll(listOf("Lisa", "Bart", "Nelson"))){
        println("Estan los 3 niños")
    } else {
        if (niños.contains("Lisa")){} else niños.add("Lisa") // De mas
        if (!niños.contains("Bart")) niños.add("Bart")       // Bien
        if (!niños.contains("Nelson")) niños.add("Nelson")
    }
// if niños.contains("Lisa") &&
    // else niños.add ("Lisa")
//    niños.contains("Bart") &&
    // else niños.add ("Bart")
//    niños.contains("Nelson")&&
   // else niños.add ("Nelson)

    //Punto 4 Peguntar si la lista de adultos contiene a Disco Stu si es asi avisar por consola si no agregarlo
    if (adultos.contains("Disco Stu")) {
        println("Si esta Disco Stu")
    } else adultos.add("Disco Stu")
        println("Si esta Disco Stu")

    //Punto 5 Eliminar al Señor Burns de la lista de Adultos
    adultos.remove("Señor Burns")
        println(adultos)

    //Punto 6
    adultos.add("Willie")
    adultos.add("Otto")
    adultos.add("Edna")
        println(adultos)

    niños.add("Ling")
    niños.add("Jimbo")
        println(niños)

    //Punto 7 Obtener Lisa, Maggie y Bart de la lista de niños y preguntar en la lista de Adultos
           // si estan sus padres "Homero" , "Marge" en caso de no estar alguno agregarlos


    if (!niños.contains("Lisa")) niños.add("Lisa")
    if (!niños.contains("Maggie")) niños.add("Maggie")
    if (!niños.contains("Bart")) niños.add("Bart")
    if (!adultos.contains("Homero")) adultos.add("Bart")
    if (!adultos.contains("Marge")) adultos.add("Marge")     //if (adultos.contains("Marge"))        no hay signo ! ni     adultos.add("Marge")
    println("Familia Simpson completa")                     //println("Familia Simpson completa")
    //else println("No Familia Simpson completa")
    // ↑ ↑ ASI DA "No familia Simpson completa" ↑ ↑

    //Punto 8 Eliminar los primeros 2 niños y los ultimos 2 adultos

    println(niños.drop(2))
    println(adultos.dropLast(2))


    //Punto 9 Imprimir las listas por consola luego de cada operacion
    //Punto 10 Crear una nueva Branch en github, que se llame "simpsons-list" , commitear y pushear el codigo.

}