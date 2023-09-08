/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface2;

/**
 *
 * @author capricorn
 */
public class Rectangle implements Drawable {
    private int width;
    private int height;
    
    
    public Rectangle(int width, int height){
        this.width =  width;
        this.height =  height;
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    public void resize(int width, int height){
        this.width = width;
        this.height = height;
        System.out.println("Resizing the rectangle to width: " + width + " and height: " + height);
    }
}
