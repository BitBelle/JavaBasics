/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author capricorn
 */
public class Vehicle {
    private String brand;
    private int maxSpeed;
    private int numOfDoors;
    private boolean hasSidecar;
    
    public Vehicle(String brand,int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    
    }
    
    public Vehicle(String brand, int maxSpeed,int numOfDoors ){
        this(brand, maxSpeed);
        this.numOfDoors = numOfDoors;
    }
    
    public Vehicle(String brand, int maxSpeed, boolean hasSidecar){
        this.hasSidecar = hasSidecar;
    }
    
   
    public String displayInfo(){
        return "The brand of the vehicle is: " + this.brand + ", The MaxSpeed of the vehicle is: " + this.maxSpeed;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
 
    public int getMaxSpeed(){
        return maxSpeed;
    }
    
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
        
    }
    
    public static void main(String[]args){
        Vehicle obj1 = new Vehicle("Benz", 50);
        obj1.getBrand();
        obj1.getMaxSpeed();
        
        System.out.println("Vehicle Details: ");
        System.out.println(obj1.displayInfo());
        System.out.println();
        
        Car obj2 = new Car("Land Rover",50,4);
        obj2.getBrand();
        obj2.getMaxSpeed();
        
        System.out.println("Car Details: ");
        System.out.println(obj2.displayInfo());
        System.out.println();
        
        Motorcycle obj3 = new Motorcycle("Honda",70,false);
        obj3.getBrand();
        obj3.getMaxSpeed();
        obj3.getHasSidecar();
        
        System.out.println("Motorcycle Details: ");
        System.out.println(obj3.displayInfo());
        System.out.println();
        
        
        
        
      
        
        
        
       
    }
    
}
