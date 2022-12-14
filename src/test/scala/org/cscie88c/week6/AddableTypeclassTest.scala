package org.cscie88c.week6

import org.cscie88c.testutils.{ StandardTest }

class AddableTypeclassTest extends StandardTest {
  
  "AddableAggregator" should {
    "sum a list of integers" in {
      // add your unit tests here
      val intListTest = List(1,2,3,4,5,6,7)
      AddableAggregator.sumWithAddable(intListTest).equals(28)
    }
    "sum a list of booleans" in {
      // add your unit tests here
      val boolListTest = List(false, true, false, true)
      AddableAggregator.sumWithAddable(boolListTest) shouldBe(true)

    }
    "sum a list of employees" in {
      // add your unit tests here

    }
  }
}
