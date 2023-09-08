/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author capricorn
 */
public class Dog implements Animal{

  @Override
  public void sound(){
      System.out.println("Woof");
  }
   
  @Override
  public void eat(){
      System.out.println("The dog is eating.");
  }
}
