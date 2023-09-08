/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Getting Input with the Scanner Class
package scanner;

import java.util.Scanner;
public class ScannerApp {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter an Integer: ");
        int x = sc.nextInt();
        System.out.println("You entered " + x + ".");
    }
    
    
}
