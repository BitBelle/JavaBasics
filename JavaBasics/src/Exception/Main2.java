/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author capricorn
 */
public class Main2 {
     public static void main(String[] args) {
        ProductDataException b = new ProductDataException();
        
        try {
            b.getProduct();
        } catch (IOException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}

    
}
