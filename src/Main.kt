class Animal( var especie: String){
    var fala:String =""
    init {
       if (especie =="dog"){
            fala ="au-au"
        }else if(especie == "gato"){
            fala = "miauu"
        }else{
            ""
       }
    }
    fun falar(){
        println(fala)
    }
}
fun main(){
     Animal("dog").falar()

}