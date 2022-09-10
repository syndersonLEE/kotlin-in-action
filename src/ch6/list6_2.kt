package ch6

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) :String? = employee.manager?.name

fun main() {
    val ceo = Employee("Sangyun LEE", null)
    val developer = Employee("Somin LEE", ceo)
    println(managerName(developer))
    println(managerName(ceo))
}