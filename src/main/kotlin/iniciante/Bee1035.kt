package iniciante
//Bee 1035 - Teste de Seleção 1
/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C
com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem
"Valores aceitos", senão escrever "Valores nao aceitos".*/

fun main(){
    val input = readLine()!!.split(" ").map{ it.toInt() }

    val A = input[0]
    val B = input[1]
    val C = input[2]
    val D = input[3]

    if((B > C) && (D > A) && (C + D) > (A + B) && (C > 0) && (D > 0) && (A % 2) == 0){
        println("Valores aceitos")
    }else{
        println("Valores nao aceitos")
    }
}