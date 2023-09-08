/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instanceVariable;

/**
 *
 * @author capricorn
 */
public class HelloApp {
    String helloMessage;
    
    
    public static void main(String[]args){
        HelloApp obj = new HelloApp();
        
        obj.helloMessage = "Hello World!";
        
        
        System.out.println(obj.helloMessage);
    }
    
}


