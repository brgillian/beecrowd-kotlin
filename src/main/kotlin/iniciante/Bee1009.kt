package iniciante

// Bee 1009 - Salário com Bônus

fun main(args: Array<String>) {
    val nome = readLine()
    val salario = readLine()!!.toDouble()
    val totalVendas = readLine()!!.toDouble()

    val comissao = (totalVendas * 15)/100
    val salarioMaisComissao = salario + comissao

    println("TOTAL = R$ %.2f".format(salarioMaisComissao))
}