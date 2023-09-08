/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpCasting2;

/**
 *
 * @author capricorn
 */
public class Lecturer extends Student{
    private String lecNo;
    private String firstname;
    private String lastname;
    private int age;
    
   
    public String getLeNo(){
        return lecNo;
    }
    
  
    public void setLecNo(String lecNo){
        this.lecNo = lecNo;
    }
    
  
    public String getFirstName(){
        return firstname;
    }
    

    public void setFirstName(String firstname){
        this.firstname = firstname;
    }
    

    public String getLastName(){
        return lastname;
    }
    
  
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    
    @Override
    public int getAge(){
        return age;
    }
    
    @Override
    public void setAge(int age){
        this.age = age;
    }
    
    @Override
    public String getfullDetails(){
        String fullname = this.firstname + " " + this.lastname;
        String lecNo = this.lecNo;
        int age = this.age;
        return "Name: " + fullname + " " + "LecNo: " + lecNo + " " + "Age:" + age;
        
    }
}
