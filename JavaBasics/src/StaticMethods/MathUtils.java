/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticMethods;

/**
 *
 * @author capricorn
 */
public class MathUtils {
    public static int add(int a, int b){
        return a + b;
    }
    
    public static int subtract(int a, int b){
        return a -b;
    }
    
    public static int multiply(int a, int b){
        return a * b;
    }
    
    public static double divide(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    
    public static void main(String[]args){
      
        
        //using the static methods
        
        int sum = MathUtils.add(10, 10);
        int difference = MathUtils.subtract(20, 10);
        int product = MathUtils.multiply(10, 10);
        double quotient = MathUtils.divide(10, 10);
        
        System.out.println("Sum of a + b = " + sum);
        System.out.println("Difference of a - b = " + difference);
        System.out.println("Product of a * b = " + product);
        System.out.println("Quotient of a / b = " + quotient);
        
    }
    
}
