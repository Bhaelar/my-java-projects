/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appleandorange;

/**
 *
 * @author Modupe Okenla
 */
public class AppleAndOrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] apples = {-2,2,1};
        int[] oranges = {5,-6};
        countApplesAndOranges(7,11,5,15,apples,oranges);
    }
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0 ; i < apples.length ; i++) {
            if((apples[i] > 0) && (apples[i] >= (s-a)) && (apples[i] <= t)) {
                ++count1;
            }
        }
        for(int j = 0 ; j < oranges.length ; j++) {
            if((oranges[j] < 0) && (oranges[j] <= (t - b)) && (oranges[j] <= s)) {
                ++count2;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
