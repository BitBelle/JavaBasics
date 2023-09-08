/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author capricorn
 */
public class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    
    @Override
    public void eat(){
        System.out.println("The cat is eating");
    }
    
}
