package kotlinObjectOrientedProgramming

import kotlin.reflect.KProperty

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property
            .name}")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue:
    Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(ClassRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk property ${property
            .name}")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue:
    String) {
        println("Fungsi ini sama seperti setter untuk property ${property
            .name} pada class $classRef")
        println("Nilai ${property.name} dari $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal3 {
    var name: String by DelegateName()
}

class Animal4 {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main() {
    val animal = Animal3()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatot Kaca"
    println("Nama Pahlawan: ${hero.name}")

    val animal2 = Animal4()
    animal2.name = "Dicoding cat"
    animal2.weight =  6.2
    animal2.age = 1

    println("Name: ${animal2.name}")
    println("Berat: ${animal2.weight}")
    println("Umur: ${animal2.age} Tahun")
}