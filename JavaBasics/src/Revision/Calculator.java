/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;

/**
 *
 * @author capricorn
 */
public class Calculator {
    
    //
    public static int num(int a,int b){
        return (a*b);
    }
    
    public static void main(String[]args){
        int x = 5;
        int y = 4;
        int result = Calculator.num(x, y);
        
        System.out.println("The result of multiplying x and y is " + result);
        
    }
}
