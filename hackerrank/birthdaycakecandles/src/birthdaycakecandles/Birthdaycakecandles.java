/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdaycakecandles;

/**
 *
 * @author Modupe Okenla
 */
public class Birthdaycakecandles {

    /**
     * @param args the command line arguments
     */
    static int birthdayCakeCandles(int[] ar) {
        int age = ar.length;
        int max = ar[0];
        int count = 0;
        for(int i = 0 ; i < ar.length ; i++) {
             if(ar[i] > max) {
                 max = ar[i];
             }
        }
        for(int j = 0 ; j < ar.length ; j++) {
            if(max == ar[j]) {
                ++count;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
