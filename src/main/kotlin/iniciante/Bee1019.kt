package iniciante

fun main(){

    var tempoSegundos = readLine()!!.toInt()
    var tempoMinutos = 0
    var tempoHoras = 0

    tempoMinutos = tempoSegundos / 60
    tempoSegundos = tempoSegundos % 60

    tempoHoras = tempoMinutos / 60
    tempoMinutos = tempoMinutos % 60

    println("$tempoHoras:$tempoMinutos:$tempoSegundos")


}