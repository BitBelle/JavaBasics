/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface3;

/**
 *
 * @author capricorn
 */
public class Triangle implements Shape{
    private double height;
    private double base;
    private double hyp;
    
    public Triangle(double height, double base, double hyp){
        this.height = height;
        this.base = base;
        this.hyp = hyp;
    }
    
    @Override
    public void calculateArea(){
        double calculateArea =  (height * base)* 1/2;
        System.out.println("The Area of the triangle is: " + calculateArea);
        
    }
    
    @Override
    public void calculatePerimeter(){
        double calculatePerimeter = height + base + hyp;
        System.out.println("The perimeter of the triangle is: " + calculatePerimeter);
    }
    
}
