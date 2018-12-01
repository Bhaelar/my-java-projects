/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysteryex;

/**
 *
 * @author Modupe Okenla
 */
public class Mysteryex {
    public static int mystery(int a, int b)
    {
        if (b == 0) 
            return 0;
        if (b % 2 == 0) 
            return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(mystery(2,25));
    }
    
}
