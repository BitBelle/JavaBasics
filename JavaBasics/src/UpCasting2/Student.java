/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpCasting2;

/**
 *
 * @author capricorn
 */
public class Student {
    private String regNo;
    private String Studentfname;
    private String Studentlname;
    private int age;
    
    public String getRegNo(){
        return regNo;
    }
    
    public void setRegNo(String regNo){
        this.regNo = regNo;
    }
    
    public String getStudentfName(){
        return Studentfname;
    }
    
    public void setStudentfName(String Studentfname){
        this.Studentfname = Studentfname;
    }
    
    public String getStudentlName(){
        return Studentlname;
    }
    
    public void setStudentlname(String lastname){
        this.Studentlname = lastname;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public String getfullDetails(){
       String fullname = this.Studentlname + " " + this.Studentlname;
       String regNo = this.regNo;
       int age = this.age;
       return "Name: " + fullname + " " + "LecNo: " + regNo + " " + "Age:" + age;
    }
}
