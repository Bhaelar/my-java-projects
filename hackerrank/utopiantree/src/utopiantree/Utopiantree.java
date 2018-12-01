/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utopiantree;

/**
 *
 * @author Modupe Okenla
 */
public class Utopiantree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(utopianTree(4));
    }
    static int utopianTree(int n) {
        int h = 1;
        
        if(n > 0) {
            for(int i = 1 ; i <= n ; i++) {
                if(i % 2 == 0) {
                    h += 1;
                } else {
                    h *= 2;
                }
            }
           
        }
        return h;
    }
}
