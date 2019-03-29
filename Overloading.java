/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author Radhika
 */
public class Overloading {
    // Method Overloading
    public int square(int intValue){
        // Method with intereger type parameter.
        
        System.out.println("Called the square with integer argument"+intValue);
        return (intValue * intValue);
        
    }
    public double square(double doubleValue){
        
         System.out.println("Called the square with double argument"+doubleValue);
         return(doubleValue* doubleValue);
    }
    
}
