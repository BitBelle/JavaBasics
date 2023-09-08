/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface2;

/**
 *
 * @author capricorn
 */
public class Circle implements Drawable {
    private int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
    
    @Override
    public void resize(int width,int height){
        System.out.println("Circle cannot be resized by width and height.");
    }

  
 
    
    
}
