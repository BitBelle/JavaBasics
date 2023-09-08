/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joptionpane;

/**
 *
 * @author capricorn
 */
import javax.swing.JOptionPane; //imports the JOptionPane class
public class DialogApp {
    public static void main(String[]args){
        String s;
        s = JOptionPane.showInputDialog("Enter an Integer: ");//showInput dialog displays an input dialog box with the prompt Enter an integer and assigns the string entered by the user to the variable named s.
        int x = Integer.parseInt(s); //conversion of string to integer
        System.out.println("You entered " + x + ".");
        System.out.println();
    }
}
