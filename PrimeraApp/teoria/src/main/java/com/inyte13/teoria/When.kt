package com.inyte13.teoria

fun main() {
  mostrarMes(10)
  println(getTrimestre(4))
  println(getSemestre(12))

}
fun mostrarMes(mes:Int):String{
  return when(mes){
    1->"Enero"
    2->"Febrero"
    3->"Marzo"
    4->"Abril"
    else->"No es un mes válido"
  }
}

fun getTrimestre(mes:Int):String{
  return when(mes){
    1,2,3->"Primer Trimestre"
    4,5,6->"Segundo Trimestre"
    7,8,9->"Tercer Trimestre"
    10,11,12->"Cuarto Trimestre"
    else ->"No es un mes válido"
  }
}

fun getSemestre(mes:Int):String{
  return when(mes) {
    in 1..6->"Primer Semestre"
    in 7..12->"Segundo Semestre"
    else -> "No es un mes válido"
  }
}
fun getSemestreSimplificado(mes:Int)=when(mes){
  in 1..6->"Primer Semestre"
  in 7..12->"Segundo Semestre"
  else -> "No es un mes válido"
}