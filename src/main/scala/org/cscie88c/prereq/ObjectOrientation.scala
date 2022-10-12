package org.cscie88c.prereq

object ObjectOrientation extends App{

  // class and instance

  class Animal {
    // define fields
    def eat() = println("I'm eating")
  }

  val anAnimal = new Animal

  // inheritance

  class Dog(val name: String) extends Animal // constructor

  val aDog = new Dog("Lassie")

  // subtype polymorphism

  val aDeclaredAnimal: Animal = new Dog("Hachi")
  aDeclaredAnimal.eat()

  // abstract class

  abstract class WalkingAnimal {
    protected val hasLegs = true // can use private or protected to restrict
    def walk(): Unit

  }

  // interface = ultimate abstract tupe
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat(animal: Animal): Unit = println("I am eating you!")
  }

  val aCroc = new Crocodile

//  aCroc.eat(aDog)
//  aCroc eat aDog // infix notation -


  object MySingleton {
    val mySpecialValue = 5327
    def mySpecialMethod(): Int = 5327

  }

  println(MySingleton.mySpecialMethod())


  object Animal { // companions - companion object
    val canLiveIndefinetly = false
  }

  val animalsCanLiveForever = Animal.canLiveIndefinetly // static fields/methods

  case class Person(name: String, age: Int)

  // may be constructed without new
  val bob = Person("Bob", 54) // = Person.apply("Bob", 54)

  // exceptions
  try {
    // code that can throw
    val x: String = null
    x.length
  } catch {
    case e: Exception => "Some faulty error message"
  } finally {
    // execute some code no matter what
  }

  // generics
  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
  }

  val aList: List[Int] = List(1,2,3) // List.apply(1,2,3)
  val first = aList.head
  val rest = aList.tail
  val aStringList = List("hello", "Scala")

  val firstString = aStringList.head

  println(firstString)

}
