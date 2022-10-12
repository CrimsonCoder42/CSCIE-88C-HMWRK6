package org.cscie88c.prereq

object ValuesVariablesTypes extends App {

  val meaningOfLife: Int = 42
  println(meaningOfLife)

  // VALS ARE IMMUTABLE

  // Compiler can infer types

  val aString: String = "Hello this is a string"
  val anotherString: String = "goodbye"

  print(aString)

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = meaningOfLife

  val aStringInterp = s"The meaning of life is ${meaningOfLife}"



}
