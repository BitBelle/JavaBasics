/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface2;

/**
 *
 * @author capricorn
 */
public class main{ 
        public static void main(String[]args){
            Drawable rectangle = new Rectangle(100,50);
            Drawable circle = new Circle(30);
            
            rectangle.draw(); 
            rectangle.resize(200, 100);
            
            System.out.println();
            
            circle.draw();
            circle.resize(50, 50);
        
        }

}

   
