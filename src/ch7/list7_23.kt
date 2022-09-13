package ch7

class Person5 (val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age : Int by ObservableProperty2(age, changedSupport)
    var salary : Int by ObservableProperty2(salary, changedSupport)
}