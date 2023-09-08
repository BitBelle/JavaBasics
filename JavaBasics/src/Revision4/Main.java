/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision4;

/**
 *
 * @author capricorn
 */
public class Main {
    public static void main(String[]args){
        /**Implicit Up casting
       
        Lion lion = new Lion();
        Animal animal = lion;
        lion.makeSound();
        animal.makeSound();
        * 
        **/
        
        
        //Explicit Up casting
        Lion lion = new Lion();
        Animal animal = (Animal)lion;
        animal.makeSound();
        
        
       
        
    }
    
}
