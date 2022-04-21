enum class Prioridade(val valores: Int){
    Baixa(1){
        override fun toString(): String {
            return "Prioridade baixa: $valores "
        }
            },
    Media(2),
    Alta(3)
}

enum class AnimalEnum{
    Dog, Gato, Boi
}

fun x ( p: Prioridade){

}
fun main(){
    for(p in Prioridade.values()){
        println(p)
    }
}