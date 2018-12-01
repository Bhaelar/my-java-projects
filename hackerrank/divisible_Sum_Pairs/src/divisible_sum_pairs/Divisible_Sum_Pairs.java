/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible_sum_pairs;

/**
 *
 * @author Modupe Okenla
 */
public class Divisible_Sum_Pairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                if((ar[i] + ar[j]) % k == 0) {
                    ++count;
                }
            }
        }
        return count;
    }
}
