/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RelatedClasses;

/**
 *
 * @author capricorn
 */
public class Ball {
    private double diameter;
    private double weight;
    
    //constructor
    public Ball(double diameter, double weight){
        this.diameter = diameter;
        this.weight = weight;
        
    }
    
    @Override
    public String toString() {
        return "The properties of the ball include: Diameter: " + this.diameter + ", Weight: " + this.weight ;
    }
    
    //getter & setter methods
    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
  
    //method to thraw a ball
    public void throwball(){
        System.out.println("The ball can be thrown");
    }
    
    //method to catch a ball
    public void catchball(){
        System.out.println("The ball can be caught");
    } 
    
    // method of hitting a ball
     public void hitball(){
         System.out.println("The ball can be hit");
     }
         

     public static void main(String[]args){
         Softball obj1 = new Softball(10,10);
         System.out.println("Softball: " + obj1);
         System.out.println("Methods of playing the Softball: ");
         obj1.catchball();
         obj1.hitball();
         obj1.throwball();
         System.out.println();
         
         Baseball obj2 = new Baseball(10,20);
         System.out.println("Baseball: " + obj2);
         System.out.println("Methods of playing the Baseball: ");
         obj2.catchball();
         obj2.throwball();
         obj2.hitball();
         System.out.println();
        
     }
}
