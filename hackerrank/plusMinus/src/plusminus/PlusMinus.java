/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusminus;

/**
 *
 * @author Modupe Okenla
 */
public class PlusMinus {
    static void plusMinus(int[] arr) {
        double count1 = 0;
        double count2 = 0;
        double count3 = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > 0) {
                ++count1;
            } if(arr[i] < 0) {
                ++count2;
            } if(arr[i] == 0) {
                ++count3;
            }
        }
        System.out.println(count1/arr.length);
        System.out.println(count2/arr.length);
        System.out.println(count3/arr.length);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
