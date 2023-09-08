/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpCasting2;

/**
 *
 * @author capricorn
 */
public class Ball {
    private String type;
    private String size;
    private String color;
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getsize(){
        return size;
    }
    
    public void setSize(String size){
        this.size = size;
    } 
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void hit(Ball b1){ //this method accepts a Ball type as a parameter. When you call this method you can pass it either a Ball object or a Baseball object
        System.out.println("The ball is hit!");
    }
    
    public void thrown(){
        System.out.println("The ball is thrown!");
    }
    
    public void kick(){
        System.out.println("The ball is kicked!");
    }
}
