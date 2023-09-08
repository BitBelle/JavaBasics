/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision2;

/**
 *
 * @author capricorn
 */
public final class MathUtils {
    //private constructor to prevent external instanciation
    private MathUtils(){
        
    }
    
    public static int addition(int a, int b){
        return a + b;
    }
    
    public static double squareRoot(double c){
        return Math.sqrt(c);
    }
        
 
    public static void main(String[] args) {        
        int result = MathUtils.addition(10, 10);
        System.out.println("Result of adding a + b = " + result);
        
       
        System.out.println("SquareRoot is " + Math.sqrt(100.0));
        
        
        
     
 }
} 

