package iniciante
//Bee1020 - Idade em dias
import kotlin.math.roundToInt

fun main(){
    //Considerar ano com 365 dias
    //Considerar mês comn 30 dias

    var idadeEmDias = readLine()!!.toInt()
    var meses = 0
    var anos = 0


    anos = idadeEmDias / 365
    println("$anos ano(s)")
    idadeEmDias = idadeEmDias - (anos * 365)
    meses = idadeEmDias / 30
    println("$meses mes(es)")
    idadeEmDias = idadeEmDias - (meses * 30)
    println("$idadeEmDias dia(s)")

}