package org.cscie88c.week6

final case class Employee(name: String, age: Int, salary: Int)

object Employee {
  //https://www.scala-lang.org/api/2.13.0/scala/math/Ordering.html

  implicit val employeeOrdering: Ordering[Employee] = Ordering.by[Employee, String](_.name)

  def defaultSortEmployees(employees: List[Employee]): List[Employee] = employees.sorted

  def sortEmployeesBySalary(employees: List[Employee]): List[Employee] = {
    implicit val sortEmployeesBySalary: Ordering[Employee] = Ordering.by[Employee, Int](_.salary)
    employees.sorted(sortEmployeesBySalary).reverse
  }


}
