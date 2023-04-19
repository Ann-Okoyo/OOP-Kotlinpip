fun main() {
  val person=Person("Ann",20)
    person.speak()
    var vehicle=Vehicle("Porsche","Turbo",2018)
    vehicle.start()

    var car =Car("Porsche","Turbo",2018,"black")
    car.start()


    var animal=Animal("Panthera leo","roars")
    animal.makeSound()

    var dog=Dog("Panthera leo","roars","woof")
    dog.makeSound()

    var cat =Cat("Panthera","purrs","Domestic cat","meow")
    cat.makeSound2()


    var human =Human("Ann",20,3)
    human.eat(4)
    human.speak("I am great.")
    human.birthday(20)

}
//Create a class called Person with properties for name and age.
//Write a method called speak that prints "Hello, my name is {name}
//and I am {age} years old."
class Person(var name:String, var age:Int){
    fun speak(){
        println("Hello, my name is $name and I am $age years old.")
    }
}
//Create a class called Vehicle with properties for make, model, and year.
//Write a method called start that prints "The {make} {model} is starting up."
open class Vehicle(var make:String, var model:String, var year:Int){
    open  fun start(){
        println("The $make $model is starting up.")
    }
}
//Create a class called Car that extends Vehicle and adds
//a property for color. Override the start method to print
//"The {color} {make} {model} is starting up."
class Car ( make:String ,  model:String,year:Int, var color:String):Vehicle (make, model,year) {
    override fun start(){
        println("The  $make $model  $color is starting up.")
    }

}
//Create a class called Animal with properties for species and
//sound. Write a method called makeSound that prints
//"{species} says {sound}."
 open class Animal(var species :String,var sound:String){
    open fun makeSound(){
        println("$species says $sound")
    }
}
//Create a class called Dog that extends Animal and sets species to "dog"
//and sound to "woof". Override the makeSound method to print "{species} barks {sound}."
class Dog(species:String,sound:String,var sound1:String):Animal(species,sound){
    override fun makeSound(){
        println("$species ,$sound ,$sound1")

    }

}
//Create a class called Cat that extends Animal and sets species to "cat"
//and sound to "meow". Override the makeSound method to print "{species}
//meows {sound}."
open class Animal1(var species:String,var sound2:String){
    open fun makeSound2(){
        println("$species $sound2")
    }
}
class Cat(species:String,sound2:String,var speciesZ:String,var soundZ:String):Animal1(species, sound2){
    override fun makeSound2(){
        println("$species $sound2 $speciesZ $soundZ")
    }
}

//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions
class Human(var name:String,var age:Int,var weight:Int,){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food.")

    }
    fun speak(speech:String){
        println("I am great.")
    }
    fun birthday(age1: Int){
        age+=1

    }
}
