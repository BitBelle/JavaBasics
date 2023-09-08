/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface3;

/**
 *
 * @author capricorn
 */
public class main {
    public static void main(String[]args){
        Shape rectangle = new Rectangle(20.0,10.0);
        System.out.println("Rectangle");
        rectangle.calculateArea();
        System.out.println();
        
        Shape circle = new Circle(8.0);
        System.out.println("Circle");
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println();
        
        Shape triangle = new Triangle(20,10,30);
        System.out.println("Triangle");
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
    
}
