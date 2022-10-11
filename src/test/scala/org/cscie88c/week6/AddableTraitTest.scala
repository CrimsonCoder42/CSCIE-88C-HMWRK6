package org.cscie88c.week6

import org.cscie88c.testutils.{ StandardTest }

class AddableTraitTest extends StandardTest {

  "plus" should {

    "add two MyInt values correctly" in {
      // add your unit tests for MyInt below
      val myIntVal =  MyInt(5).plus(MyInt(3))
      myIntVal shouldBe(MyInt(8))
    }

    "add two MyBool values correctly" in {
      // add your unit tests for MyBool below
      MyBool(false).plus(MyBool(false)) shouldBe(MyBool(false))
      MyBool(true).plus(MyBool(false)) shouldBe(MyBool(true))
      MyBool(true).plus(MyBool(true)) shouldBe(MyBool(true))
    }
   } 
}
