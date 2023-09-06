/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Downcasting;

/**
 *
 * @author capricorn
 */
public class Main {
    public static void main(String[]args){
        //upcasting..implicitly
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        animal1.makesound();
        animal2.makesound();
        
        /**DownCasting..only done explicitly
         * using instanceOf checks if the 
         */
        
        if (animal1 instanceof Dog){
            //if true we downcast..
            Dog dog = (Dog) animal1;
            dog.fetches(); //now we are able to access the specific method of the subclass
        } else {
            System.out.println("animal1 is not a Dog");
        }
        
        
       
            Cat cat = (Cat) animal2;
            cat.scratches(); //now we are able to access the specific method of the subclass
        
    }
    
}
