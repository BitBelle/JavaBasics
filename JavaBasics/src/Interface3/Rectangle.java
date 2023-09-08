/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface3;

/**
 *
 * @author capricorn
 */
public class Rectangle implements Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        
    }
    
    @Override
    public void calculateArea(){
        double calculateArea = length * width;
        System.out.println("The area is: " + calculateArea);
    }
    
    @Override
    public void calculatePerimeter(){
        double calculatePerimeter = 2 * (length * width);
        System.out.println("The perimeter is : " + calculatePerimeter);
    }
}
