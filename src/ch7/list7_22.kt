package ch7

import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

class ObservableProperty2 (var propValue: Int, val changeSupport: PropertyChangeSupport) {
    operator fun getValue(p: Person5, prop:KProperty<*>): Int = propValue
    operator fun setValue(p: Person5, prop:KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}