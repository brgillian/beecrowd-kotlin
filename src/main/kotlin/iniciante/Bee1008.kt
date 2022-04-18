package iniciante

fun main(){
    val numeroFuncionario = readLine()!!.toInt()
    val totalHorasTrabalhadas = readLine()!!.toInt()
    val valorHora = readLine()!!.toDouble()

    val salario = totalHorasTrabalhadas * valorHora

    println("NUMBER = $numeroFuncionario \nSALARY = U$ %.2f".format(salario))

}