/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author capricorn
 */
public class MyClass extends Exception{
    public MyClass (String s){
        super(s);
    }
    
    public static void main(String[]args) throws MyClass{
        try {
             int a = 10;
             int b = 0;
             int c = 5;
              
            int addition = a + b + c;
            int division = a / b;
             
             System.out.println("A simple calculation: ");
             System.out.println(addition);
             System.out.println(division);
           
        }
       catch (ArithmeticException e){
           
           throw new MyClass ("An Arithmetic error occured, Division by Zero.");
       }
  
    }
}
