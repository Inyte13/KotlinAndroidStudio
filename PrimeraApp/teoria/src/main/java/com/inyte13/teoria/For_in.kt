package com.inyte13.teoria

fun main () {
  val nombres = arrayOf("Mafer", "Lucía", "Camila", "Paula", "Carlos")
  for (i in nombres.indices) {
    println("${i}: ${nombres[i]}")
  }
}