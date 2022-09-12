package ch7

import java.beans.PropertyChangeListener

class Person3 (val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            changedSupport.firePropertyChange("age", oldValue, newValue)
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changedSupport.firePropertyChange(
                "salary", oldValue, newValue
            )
        }
}

fun main() {
    val p = Person3("Sangyun", 30, 6500)
    p.addPropertyChangeListener(
        PropertyChangeListener { event ->
            println("Property ${event.propertyName} changed" +
            "from ${event.oldValue} to ${event.newValue}")
        }
    )

    p.age = 29
    p.salary = 5000
}