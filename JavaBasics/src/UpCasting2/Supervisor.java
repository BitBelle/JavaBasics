/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpCasting2;

/**
 *
 * @author capricorn
 */
public class Supervisor {
    private String fullname;
    private int idno;
    private String jobgroup;
    
    public Supervisor(){
        
    }
    
    public String getfullname(){
        return fullname;
    }
    
    public void setFullname(String fullname){
        this.fullname = fullname;   
    }
    
    public int getIdno(){
        return idno;
    }
    
    public void setIdno(int idno){
        this.idno = idno;
    }
    
    public String getJobgroup(){
        return jobgroup;
    }
    
    public void setJobgroup(String jobgroup){
        this.jobgroup = jobgroup;
    }
    
    public String getfulldetails(){
        return fullname + " " + idno + " " + jobgroup;
    }
    
}
