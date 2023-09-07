/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author capricorn
 */
public class Checkedexception {
    
    private static void readFile (String fileName) {
        try{
       FileReader reader = new FileReader (fileName); 
        }
        catch (FileNotFoundException fnfe){
            System.out.println("Hey that file does not exist!");
        }
    }
    
    public static void main(String[] args){
        
        readFile("myFile.txt");
        
    }
    
}
