package Carro

class Carro {
    var cor: String = "preto"
    var modelo: String = "Honda"
    var ano: Int = 2022
    var consumo: Double? = null
    var tipoCombustivel: String = ""

    fun exibirModelo(modeloCarro: String){
        println("O modelo é $modeloCarro")
    }

    fun correr(){
        println("Carro está correndo...")
    }

    fun parar(){
        println("O carro está parando...")
    }

    fun comprar(){
        println("Comprando ...")
    }
}