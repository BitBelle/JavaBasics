/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;
import java.io.IOException;

/**
 *
 * @author capricorn
 */
public class ProductDDB {
   public static Product getProduct() throws ProductDataException, ClassNotFoundException {
        // Simulate an I/O error 
        try {
            // Code to retrieve data from file or database
            throw new IOException("Simulated I/O error");
        } catch (IOException ioException) {
            throw new ProductDataException("Error retrieving product data: " + ioException.getMessage());
        }
    }
}

   
   


