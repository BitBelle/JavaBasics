/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author capricorn
 */
public class Circle extends Shape {
    private double radius;
    
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    double calculate_area(){
       return Math.PI * radius * radius;
    }
    
    @Override
    public double calculate_perimeter() {
        return 2 * Math.PI * radius * radius;
    }
    
    
    
}

    

