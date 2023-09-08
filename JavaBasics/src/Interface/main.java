/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author capricorn
 */
public class main {
    public static void main(String[]args){
        Animal dog =new Dog();
        dog.sound();
        dog.eat();
        
        Animal cat = new Cat();
        cat.sound();
        cat.eat();
    }
    
}
