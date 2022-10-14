package org.cscie88c.week6

import org.cscie88c.testutils.{ StandardTest }

class EmployeeTest extends StandardTest {
  "Employee" should {
 
    "have a default sort order" in {
      // write unit tests here
      val e1 = Employee("Zaphod",33,178852)
      val e2 = Employee("Ford",37,189359)
      val e3 = Employee("Arthur",43,170273)
      val e4 = Employee("Marvin",23,267907)
      val empList = List(e1, e2, e3, e4)

      val testVal = empList.sorted
      testVal.head.name should equal("Arthur")

    }

    "sort employees by salary" in {

      val e1 = Employee("Zaphod", 43, 178852)
      val e2 = Employee("Ford", 27, 189359)
      val e3 = Employee("Arthur", 33, 170273)
      val e4 = Employee("Marvin", 48, 267907)
      val testList = List(e1, e2, e3, e4)
      // write unit tests here
      val empSalSort = Employee.sortEmployeesBySalary(testList)
      empSalSort.head.salary should equal(267907)
    }
  }
}
