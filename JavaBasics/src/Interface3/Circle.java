/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface3;

/**
 *
 * @author capricorn
 */
public class Circle implements Shape {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public void calculateArea(){
        double calculateArea = Math.PI * radius * radius;
        System.out.println("The area is: " + calculateArea);
    }
    
    @Override
    public void calculatePerimeter(){
        double calculatePerimeter = 2 * Math.PI * radius * radius;
        System.out.println("The perimeter is: " + calculatePerimeter);
    }
 
    
    
}
