/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablelength;

/**
 *
 * @author Modupe Okenla
 */
public class VariableLength {
    public static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] c = {1,2,4,2,6};
        System.out.print(product(c));
    }
    public static int product(int[] arr) {
        int product = 1;
        for( i = 0; i < arr.length ; i++) {
            
            product *= arr[i];
            
        }
        return product;
    }
    
}
