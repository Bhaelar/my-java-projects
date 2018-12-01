/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakingtherecords;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class BreakingTheRecords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] scores = {10, 5, 20, 20 ,4 ,5 ,2 ,25, 1};
        System.out.println(Arrays.toString(breakingRecords(scores)));
    }
    static int[] breakingRecords(int[] scores) {
        int min = scores[0];
        int max = scores[0];
        int countmax = 0;
        int countmin = 0;
        for(int i = 1 ; i < scores.length ; i++) {
            if(scores[i] < min) {
                min = scores[i];
                ++countmin;
            }
            if(scores[i] > max) {
                max = scores[i];
                ++countmax;
            }
        }
        int[] list = {countmax, countmin};
        return list;
   }
}
