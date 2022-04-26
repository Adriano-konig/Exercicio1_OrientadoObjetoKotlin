package Exercicios_1

class Funcionario(
    var profissao: String
    //var tempo: Int

) {

    var nome: String = "Luiz"
    var sobreNome: String = "Silva"
    var horasTrabalhadadas: Int = 10
    var valorPorHora: Double = 25.50

    fun nomeCompleto(){
        println("Nome completo: $nome $sobreNome valor por hora é $valorPorHora")
    }

    fun calcularSalario(){
        var calcularHorasTrabalhada = horasTrabalhadadas * valorPorHora
        println("Valor calculado do mes é $calcularHorasTrabalhada")
    }

    fun incrmentarHoras(novoHoras: Int){
        horasTrabalhadadas+=novoHoras
        println("O novo calculo de valor por $horasTrabalhadadas horas será: ")
        println(horasTrabalhadadas * valorPorHora)
    }



}