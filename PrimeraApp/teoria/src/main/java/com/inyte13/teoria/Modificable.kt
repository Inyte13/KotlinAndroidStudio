package com.inyte13.teoria

fun precioTicket(edad: Int, esLunes: Boolean): Int {
  return when(edad) {
    in 0..12->15
    in 13..60->if (esLunes) 25 else 30
    in 61..100->20
    else -> -1
  }
}
fun main() {
  val child = 5
  val adult = 28
  val senior = 87

  val isMonday = true

  println("The movie ticket price for a person aged $child is \$${precioTicket(child, isMonday)}.")
  println("The movie ticket price for a person aged $adult is \$${precioTicket(adult, isMonday)}.")
  println("The movie ticket price for a person aged $senior is \$${precioTicket(senior, isMonday)}.")
}
