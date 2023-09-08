/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author capricorn
 */
public class Motorcycle extends Vehicle{
     private String brand;
     private int maxSpeed;
     private boolean hasSidecar;

    public Motorcycle(String brand, int maxSpeed, boolean hasSidecar) {
        super(brand, maxSpeed, hasSidecar);
        
        this.brand = brand;
        this.maxSpeed =maxSpeed;
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public String displayInfo(){
        return "Brand of the Motorcycle is: " + this.brand + ", MaxSpeed of the Motorcycle is: " + this.maxSpeed + ", Has a side car(true or false): " + this.hasSidecar;
    }


    public boolean getHasSidecar(){
        return hasSidecar;
    }
    
    public void setHasSidecar(boolean hasSidecar){
        this.hasSidecar = hasSidecar;
    }
     
}
