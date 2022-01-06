package dev.andreribeiro.collections

fun main() {
    val nomes = Array(3) { "" }

    nomes[0] = "MARIA"
    nomes[1] = "JOSE"
    nomes[2] = "ANDRÉ"

    for (nome in nomes) {
        println(nome)
    }
    println("-------------------------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("Andre", "Luiz", "Gustavo")

    for (nome in nomes2){
        println(nome)
    }
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}