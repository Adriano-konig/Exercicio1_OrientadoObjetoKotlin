package casa

class PlantaCasa {
    var quantidadePortas: Int = 4
    var comodos: Int = 6
    var areaCasa: Double = 250.00
    var nomeDono: String = "Jessica"
    var nomeArquiteto: String = "Carol"

    fun contruir(){
        println("Construindo a casa....")
    }

    fun pintarCasa(){
        println("Pintando a casa...")
    }

    fun exibirInformacoesDonoCasa(){
        println("Proprietario $nomeDono")
    }
}