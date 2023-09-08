/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpCasting2;

/**
 *
 * @author capricorn
 */
public class Baseball extends Ball {
    private String type;
    private String size;
    private String color;
    
    @Override
    public String getType(){
        return type;
    }
    
    @Override
    public void setType(String type){
        this.type = type;
    }
    
    @Override
    public String getsize(){
        return size;
    }
    
    @Override
    public void setSize(String size){
        this.size = size;
    } 
    
    @Override
    public String getColor(){
        return color;
    }
    
    /**
     *
     * @param color
     */
    @Override
    public void setColor(String color){
        this.color = color;
    }
    
    @Override
     public void hit(Ball b1){ //this method accepts a Ball type as a parameter. When you call this method you can pass it either a Ball object or a Baseball object
        System.out.println("The ball is hit!");
    }
   
    
    
    @Override
    public void kick(){
        System.out.println("The baseball is kicked!");
    }
    
    public static void main(String[]args){
        Ball b1 = new Baseball();
        b1.setType("Football");
        b1.setColor("White");
        b1.setSize("Medium");
        System.out.println("Ball Properties: " + b1.getType() + " " + b1.getsize() + " " + b1.getColor());
        b1.kick();
        b1.thrown();
        b1.kick();
        
        Ball b2 = b1;
        
    }
}
