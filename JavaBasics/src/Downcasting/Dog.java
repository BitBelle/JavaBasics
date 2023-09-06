/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Downcasting;

/**
 *
 * @author capricorn
 */
public class Dog extends Animal {
    
    
    @Override
    public void makesound(){
        System.out.println("The Dog Barks!");
    }
    
    public void fetches(){
        System.out.println("The Dog fetches the ball!");
    }
}
