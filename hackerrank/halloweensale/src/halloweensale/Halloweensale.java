/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halloweensale;

/**
 *
 * @author Modupe Okenla
 */
public class Halloweensale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = howManyGames(100, 19, 1, 180);
        System.out.println(a);
    }
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        if(s < p) {
            return 0;
        }
        while(s >= m) {
            int present = p;
            if(s < present) {
                break;
            }
            if(present > m) {
                s -= p;
                count++;
                //System.out.println("Game: " + count + " price: " + p + " money left: " + s);
                p -= d;
            } else {
                s -= m;
                count++;
                //System.out.println("Game: " + count + " price: " + m + " money left: " + s);
            }
        }
        return count;
    }
}
