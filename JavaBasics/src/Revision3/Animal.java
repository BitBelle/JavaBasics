/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision3;

/**
 *
 * @author capricorn
 */
public class Animal {
    private String breathe;
    private String feed;
    private String sleep;
    private String move;
    private String excrete;
    
    
    public Animal(String feed, String sleep, String move, String excrete){
        this.feed = feed;
        this.move = move;
        this.sleep = sleep;
        this.excrete = excrete;
    }
    
    @Override
    public String toString(){
        return "The basic characteristics of Animals are: " + this.feed +"," + this.excrete +"," + this.move +"," + this.sleep;
    }
    
 
    
    public String getFeed(){
        return feed;
    }
    
    public void setFeed(){
        this.feed = feed;
    }
    
    public String getSleep(){
        return sleep;
    }
    
    public void setSleep(){
        this.sleep = sleep;
    }
    public String getMove(){
        return move;
    }
    
    public void setMove(){
        this.move = move;
    }
    
    public String getExcrete(){
        return excrete;
    }
    
    public void setExcrete(){
        this.excrete = excrete;
    }


    public static void main(String[args]){
        Mammal obj1 = new Mammal();
        
}



}

