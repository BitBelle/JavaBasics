/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CheckedException;
import java.util.Scanner;

/**
 *
 * @author capricorn
 */
public class SquareRootCalc{
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        
        try{
            double number = scanner.nextDouble(); // may throw InputMismatch exception
            if (number < 0) {
                System.out.println("Please enter a non-negative number.");
                
            } else {
                double squareRoot = Math.sqrt(number);//calcs the sqrt
                System.out.println("Square root of " + number + " is " + squareRoot);   
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        scanner.close();
    }
    
}