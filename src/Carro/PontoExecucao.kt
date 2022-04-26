package Carro

import kotlin.system.exitProcess

fun main() {
    val hondaCivic: Carro = Carro()
    hondaCivic.correr()
    hondaCivic.modelo = "Sedan"
    hondaCivic.cor = "preto"

    println("O Honda Civic tem o modelo: ${hondaCivic.modelo}")
    //hondaCivic.exibirModelo()

    val porche: Carro = Carro()
    porche.correr()
    porche.modelo = "Esportivo"
    porche.cor = "vermelho"

    println("O Proche tem o modelo: ${porche.modelo}")





}