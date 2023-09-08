/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpCasting2;

/**
 *
 * @author capricorn
 */
public class Main {
    public static void main(String[]args){
        
        Student obj1 = new Student();
        
        Lecturer obj2 = new Lecturer();
        obj2.setLecNo("E201");
        obj2.setFirstName("Patrick");
        obj2.setLastName("Gikunda");
        obj2.setAge(40);
      
        System.out.println("Lecturer Details " + obj2.getfullDetails());
        System.out.println("Student Details: " + obj1.getfullDetails());
        
        
        Student obj3 = (Student) obj1;
        obj3.setStudentfName("Mercy)");
        obj3.setStudentlname("Wainaina");
        obj3.setRegNo("C027-01-0779/2020");
        obj3.setAge(22);
        System.out.println("The upcasted object's output " + obj3.getfullDetails());
        
        
        
        
        
        
    }
    
}
