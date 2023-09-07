/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExplicitUpcasting;

/**
 *
 * @author capricorn
 */
public class Main {
    public static void main(String[]args){
        //explicit upcasting (manually done using casting syntax)
        Dog dog = new Dog();
        dog.makeSound();
        
      
        
        //explicit upcasting 
        Animal animal = (Animal) dog;
        animal.makeSound();
    }
    
}
