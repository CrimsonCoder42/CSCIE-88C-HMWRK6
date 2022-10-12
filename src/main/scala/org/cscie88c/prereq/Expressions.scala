package org.cscie88c.prereq

object Expressions extends App{

  // expressions can be reduced to a value

  val x = 1 + 2 // Expression




  // instructions (DO) vs expressions (value or type)

 val codeBlock = {
   val y = 2
   val z = y + 1

  //definition
   if (z > 2) "Hello" else "Goodbye"
 }

  // recursive function
  def factorial(n: Int): Int =
    if(n <= 1) 1
    else n * factorial(n - 1)


  println(factorial(5))
}


