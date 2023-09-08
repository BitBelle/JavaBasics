/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author capricorn
 */
public class BestPlayer extends Player {
    @Override
    public int move(){
        System.out.println("\nThe best player says: ");
        System.out.println("I'm looking for a good move ");
        return findBestMove();
        
    }
    
    private int findBestMove(){
        int square = 0;
        
        return square;
    }
    
}
