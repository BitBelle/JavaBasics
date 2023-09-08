/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpCasting2;

/**
 *
 * @author capricorn
 */
public class MainAnimal {
    public static void main(String[]args){
        //implicit upcasting
        Animal animal1 = new Dog(); //here we are creating a new Dog object..to be stored in 'animal1' of type Animal 
        Animal animal2 = new Cat();//here we are ecreating a Cat new object..to be stored in 'animal2' still of type Animal
        
        animal1.makesound();
        animal2.makesound();
        
        /**Up-casting allows you to access only the methods and properties defined 
         * in the base-class and not the specific methods of the subclasses.
         */
        
        
        
    }
    
}
