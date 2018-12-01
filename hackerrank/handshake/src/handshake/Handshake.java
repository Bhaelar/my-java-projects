/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handshake;

/**
 *
 * @author Modupe Okenla
 */
public class Handshake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(handshake(11));
    }
    static int handshake(int n) {
        /*
         * Write your code here.
         */
        return ((n-1) * (n) / 2);
    }
}
