
class Pessoa (val anoNascimento: Int, var nome:String){
    var olhos: String? = null
    var doc: String =" "

    constructor(anoNascimento: Int, nome: String, doc:String): this(anoNascimento, nome){
        this.doc = doc
    }
    fun dormir(){

    }
    fun acordar(){

    }
}

fun main(){
    var pessoa: Pessoa = Pessoa(2005, "Denise", "123456789")
    pessoa.nome
    pessoa.dormir()
    pessoa.acordar()
    pessoa.olhos
    pessoa.doc

}