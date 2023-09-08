/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author capricorn
 */
public class MyException2 extends Exception{
    
    
    public static void main(String[]args){
       try {
           throw new MyException2();
       } 
       catch (MyException2 ex) {
           System.out.println("Caught");
           System.out.println(ex.getMessage());
       }
    }
}
