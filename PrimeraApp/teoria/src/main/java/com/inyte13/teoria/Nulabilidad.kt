package com.inyte13.teoria

fun main() {
//  val str:String=null // Al declarar una val por defecto no puede ser Null
  val str:String?=null // Puede ser null
  println(str?.get(1)?:"Es nulo")
}