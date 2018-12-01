/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatefeast;

/**
 *
 * @author Modupe Okenla
 */
public class Chocolatefeast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(chocolateFeast(43203 ,60 ,5));
    }
    static int chocolateFeast(int n, int c, int m) {
        int buy = 0;
        buy = n/c;
        int total = 0;
        total += buy;
        int wrap = buy;
        
        while(wrap >= m) {
            
            total += wrap / m;
            wrap = wrap + (wrap / buy) - m;
            
        }
        return total;
    }
}
