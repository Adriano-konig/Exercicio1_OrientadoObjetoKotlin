package Exercicios_1

fun main() {
    val novoFuncionario: Funcionario = Funcionario(profissao = "")
   // novoFuncionario.nome
   // novoFuncionario.sobreNome
   // novoFuncionario.valorPorHora
  //  novoFuncionario.horasTrabalhadadas


    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()

    novoFuncionario.incrmentarHoras(8)

    var listaFuncionarioNome = arrayOf<String>()
    //var listaFuncionarioTempo = ArrayList<Int>(9)
    //ListaFuncionario.add(novoFuncionario)

   for (i: Int in 1..9){
        println("Profissão: ")
        listaFuncionarioNome[i] = readln()
        //println("Tempo: ")
       // listaFuncionarioTempo[i] = readln().toInt()
    }
//    for (i: Int in listaFuncionarioTempo.indices){
//        println("Tempo: ")
//        listaFuncionarioTempo[i] = readln().toInt()
//    }
    //val novoLista: Funcionario = Funcionario(listaFuncionarioNome, listaFuncionarioTempo)
    for (i: Int in  1..9){
   // val novoLista: Funcionario = Funcionario(listaFuncionarioNome[i])
        println("Profissão: ${listaFuncionarioNome[i]}")
    }
}