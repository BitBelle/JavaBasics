/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImplicitUpcasting;

/**
 *
 * @author capricorn
 */
public class main {
    public static void main(String[]args){
        //implicit upcasting (automatically done by the compiler)
        Dog dog = new Dog();
        Animal animal = dog; // Implicit upcasting,no need for explicit casting..coz we are assigning a 'Dog' object to an 'Animal' variable 
        // Both variables 'dog' and 'animal' refer to the same object (Dog)
        // but 'animal' is treated as its superclass (Animal) type.
        dog.makeSound();
        animal.makeSound(); //method of dog class
    }
    
}
