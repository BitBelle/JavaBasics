/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;

/**
 *
 * @author capricorn
 */
public class Addition {
    private int a;
    private int b;
    private int c;
    
    int result = a + b + c;
    
    public Addition(){
        this.a = 10;
        this.b = 20;
        this.c = 30;
        
        
    }  
    
    @Override
   public String toString() {
        return  "The result is" + this.result;
    }
    
}
