package com.inyte13.teoria

fun main() {
  saludar()
  saludar("Sara")
  println(sumar(3,4))
  println(sumarAbreviado(19,2))
}

fun saludar(nombre:String="Oriana"){ // Siempre los valores que recibe son explícitos
  println("Hola $nombre")
}

fun sumar(num1:Int,num2:Int):Int{ // Indicamos el valor que retorna :Int
  return num1+num2
}

fun sumarAbreviado(a:Int,b:Int)=a+b // Incluso se puede ser implícito el valor que retorna