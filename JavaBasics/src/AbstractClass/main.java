/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

import java.util.Scanner;
/**
 *
 * @author capricorn
 */
public class main {
    public static void main(String[] args) {
      
        
        Scanner scanner = new Scanner(System.in);
        /**
        * This line creates a new Scanner object named scanner, 
        * which is used to read user input from the console.
        */
        
        System.out.println("Rectangle:");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area: " + rectangle.calculate_area());
        System.out.println("Perimeter: " + rectangle.calculate_perimeter());

        System.out.println("\nCircle:");
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        Circle circle = new Circle(radius);
        System.out.println("Area: " + circle.calculate_area());
        System.out.println("Perimeter: " + circle.calculate_perimeter());
    }
  
    
}
