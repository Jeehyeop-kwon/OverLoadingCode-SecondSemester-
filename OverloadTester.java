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
public class OverloadTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Overloading mtd = new Overloading();
        System.out.println("Integer Square:"+mtd.square(7));
        System.out.println("Double Square:"+mtd.square(7.5));
        
        
        
    }
    
}
