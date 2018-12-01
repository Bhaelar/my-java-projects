/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Modupe Okenla
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static double calc(double a , double b) {
        if(a > b) {
            return b;
        }
        if(b < a + 0.5) {
            return b;
        }
        
        return b - a - 0.5;
        
    }
}
