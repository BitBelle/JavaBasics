/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision2;

/**
 *
 * @author capricorn
 */
public class Voter {
    private String firstname;
    private String lastname;
    private int age;
    
    public String getFullname(){
        return this.firstname + this.lastname;
    }
    
    public void setFirstname(String name){
        this.firstname = name;
    }
    
    public void setLastname(String name){
        this.lastname = name;
    }
    
    
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}


