/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author capricorn
 */
public class Car extends Vehicle {
  
    private int numOfDoors;

    public Car(String brand, int maxSpeed, int numOfDoors) {
        super(brand, maxSpeed,numOfDoors);
        

        this.numOfDoors = numOfDoors;
    }
    
  
    
    @Override
    public String displayInfo(){
        super.displayInfo();
        return "Number of doors of the car: " + this.numOfDoors;
    }
   
    public int getNumOfDoors(){
        return numOfDoors;
    }
    
    public void setNumOfDoors(int numOfDoors){
         this.numOfDoors = numOfDoors;
    }

}

