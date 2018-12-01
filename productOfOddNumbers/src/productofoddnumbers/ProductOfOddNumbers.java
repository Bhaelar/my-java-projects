/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productofoddnumbers;

/**
 *
 * @author Modupe Okenla
 */
public class ProductOfOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int product = 1;
        for(i=1;i<16;i=i+2) {
            
            product *= i;
        }
       
        System.out.println(product);
        
    }
    
}
