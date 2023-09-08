/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UpCasting2;

/**
 *
 * @author capricorn
 */
public class Intern extends Supervisor {
    private String fullname;
    private String schoolid;
    private String course;
    private String campusname;
    
    public Intern(){
        }
    
    @Override
    public String getfullname(){
        return fullname;
    }
    
    @Override
    public void setFullname(String fullname){
        this.fullname = fullname;   
    }
    
    public String getschoolid(){
        return schoolid;
    }
    
    public void setschoolid(String schoolid){
        this.schoolid = schoolid;
    }
    
    public String getcampusname(){
        return campusname;
    }
    
    public void setcampusname(String campusname){
        this.campusname = campusname;
    }
     
    public String getcourse(){
        return course;
    }
    
   
    public void setcourse(String course){
        this.course = course;   
    }
    
    @Override
    public String getfulldetails(){
        return fullname + " " + schoolid + " " + campusname + " " + course;
    }
    
   public static void main(String[]args){
      // Supervisor obj1 = new Supervisor();
       //System.out.println("Supervisor Details " + obj1.getfulldetails());
       /**
        * 
       Intern obj2 = new Intern();
       obj2.setFullname("Deborah Njoki");
       obj2.setschoolid("C01");
       obj2.setcourse("Pharmacy");
       obj2.setcampusname("JKUAT");
       System.out.println("Intern Details: " + obj2.getfulldetails());
       
       Supervisor obj3 = (Supervisor) obj1;
       obj3.setFullname("Alvin Holmes");
       obj3.setIdno(300178);
       obj3.setJobgroup("C");
       System.out.println("Supervisor Details: " + obj3.getfulldetails());
       * 
       */
       Supervisor obj3 = new Supervisor();
       obj3.setFullname("Alvin Holmes");
       obj3.setIdno(300178);
       obj3.setJobgroup("C");
       System.out.println("Supervisor Details: " + obj3.getfulldetails());
       
       Intern obj4 = new Intern();
       
       
       Intern obj5 = (Intern) obj3;
       obj5.setFullname("Mercy Wainaina");
       obj5.setschoolid("A2001");
       obj5.setcourse("BBIT");
       obj5.setcampusname("DEKUT");
       
       System.out.println("Intern Details: " + obj5.getfulldetails());
      
       
   }
}
