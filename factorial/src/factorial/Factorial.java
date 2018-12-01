/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Modupe Okenla
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        long fact=1;
        System.out.println("number     factorial");
        
            for (i=1;i<21;i++) {
                
                fact *= i;
                    
                
                System.out.println(i+"              " + fact);
            }
            
        
        
        
    }
    
}
