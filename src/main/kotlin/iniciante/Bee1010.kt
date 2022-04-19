package iniciante

fun main(){
      val peca1 = readLine()!!.split(" ").map{ it.toDouble() }
      val peca2 = readLine()!!.split(" ").map{ it.toDouble() }

      val total = (peca1[1] * peca1[2]) + (peca2[1] * peca2[2])

      println("VALOR A PAGAR: R$ %.2f".format(total))
}