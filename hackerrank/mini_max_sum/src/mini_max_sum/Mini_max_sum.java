/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_max_sum;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Mini_max_sum {
    static void miniMaxSum(int[] arr) {
        long total = 0;
        long min = 999999999;
        long max = 0;
        int[] newList = new int[arr.length];
        int[] minmax = new int[2];
        for (int i = 0 ; i < arr.length ; i++) {
            total += arr[i];
        }
        for (int j = 0 ; j < arr.length ; j++) {
            newList[j] = (int) (total - arr[j]);
            if(newList[j] > max)
                max = newList[j];
            if(newList[j] < min)
                min = newList[j];
        }
        
        System.out.println(min + " " + max);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = {1,2,3,4,5};
        miniMaxSum(list);
    }
    
}
