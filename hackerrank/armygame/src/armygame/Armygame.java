/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armygame;

/**
 *
 * @author Modupe Okenla
 */
public class Armygame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(gameWithCells(1,5));
    }
    static int gameWithCells(int n, int m) {
        /*
         * Write your code here.
         */
        if(n == 1 && m == 1) {
            return 1;
        }
        if(n == 1 && m > 1 && m % 2 == 0) {
            return m/2;
        }
        if(n == 1 && m > 1 && m % 2 != 0) {
            return (m/2) + 1;
        }
        if(m == 1 && n > 1 && n % 2 == 0) {
            return n/2;
        }
        if(m == 1 && n > 1 && n % 2 != 0) {
            return (n/2) + 1;
        }
        return (n - 1) * (m - 1);
    }
}
