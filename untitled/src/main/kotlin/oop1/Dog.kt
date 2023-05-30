import oop1.Animal
import kotlin.random.Random

class Dog: Animal {
    constructor(energy: Int, weight: Int, currentAge: Int, maxAge: Int, name: String):
            super(energy,weight,currentAge,maxAge,name)

    override fun animalGo() {
        var animalGoEnergy = energy - 5
        var animalGoWeight = weight - 1
        println("${name} бежит. Энергия - $animalGoEnergy, новый вес - $animalGoWeight, возраст - ${tryIncrementAge()}")
    }
    override fun bornChild(): Dog {
        energy = Random.nextInt(1,10)
        weight = Random.nextInt(1,7)
        currentAge = 0
        println("На свет появился ${name}, энергия - ${energy}, вес - ${weight}, максимальный возраст жизни - ${maxAge}")
        return Dog(energy,weight,currentAge,maxAge,name)
    }
}