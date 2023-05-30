package oop1

import kotlin.random.Random
open class Animal(var energy: Int, var weight: Int, var currentAge: Int, var maxAge: Int, var name: String) {


    fun sleep() {
        var animalSleepEnergy = energy + 5
        var animalSleepAge = currentAge + 5
        println("${name} кушает. Его энергия - $animalSleepEnergy его новый возраст - $animalSleepAge")
    }

    fun eat() {
        var animalEatEnergy = energy + 3
        var animalEatWeight = weight + 1
        println("${name} кушает. Его энергия - $animalEatEnergy, его новый вес - $animalEatWeight, его новый возраст ${tryIncrementAge()}")
    }

    open fun animalGo() {
            var animalGoEnergy = energy - 5
            var animalGoWeight = weight - 1
            println("${name} гуляет. Его энергия - $animalGoEnergy, его новый вес - $animalGoWeight, его возраст - ${tryIncrementAge()}")
        }

        fun isTooOld(): Boolean {
            if (currentAge >= maxAge) {
                return true
            } else {
                return false
            }
        }

       open fun tryIncrementAge(): Int {
            if (Random.nextBoolean())
                currentAge += 1
           return currentAge
        }
    open fun bornChild(): Animal {
      energy = Random.nextInt(1,10)
      weight = Random.nextInt(1,7)
        currentAge = 0
      println("На свет появился ${name}, энергия - ${energy}, вес - ${weight}, максимальный возраст жизни - ${maxAge}")
      return Animal(energy,weight,currentAge,maxAge,name)
    }
}
