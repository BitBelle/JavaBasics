/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author capricorn
 */
public class Rectangle extends Shape {
    private double length;
    private double width;
   
  
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculate_area(){
        return length * width;
    }
   

    @Override
    double calculate_perimeter() {
        return 2 * (length * width);
    }

 

    
    
}
