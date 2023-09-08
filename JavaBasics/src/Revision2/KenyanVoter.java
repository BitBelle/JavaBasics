/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision2;

/**
 *
 * @author capricorn
 */
public class KenyanVoter extends Voter {

    private String firstname;
    private String lastname;
    private int age;

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the age
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getFullname() {
        return this.firstname + this.lastname;
    }

    public static void main(String[] args) {
        Voter voter = new Voter();
        System.out.println("Voter fullname: " + voter.getFullname());
        KenyanVoter mercy = new KenyanVoter();
        mercy.setFirstname("mercy");
        mercy.setLastname("njeri");

        System.out.println("KenyanVoter fullname: " + mercy.getFullname());
        System.out.println("Voter fullname: " + voter.getFullname());
        Voter mVoter = (Voter) mercy;
        mVoter.setFirstname("parent");
        mVoter.setLastname("voter");
        System.out.println("Voter fullname: " + mVoter.getFullname());

//            System.out.println("");
    }
}
