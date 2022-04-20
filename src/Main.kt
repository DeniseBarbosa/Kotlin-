
class Pessoa (val anoNascimento: Int, var nome:String){
    var olhos: String = ""
    fun dormir(){

    }
    fun acordar(){

    }
}

fun main(){
    var pessoa: Pessoa = Pessoa(2005, "Denise")
    pessoa.nome
    pessoa.dormir()
    pessoa.acordar()
    pessoa.olhos
}