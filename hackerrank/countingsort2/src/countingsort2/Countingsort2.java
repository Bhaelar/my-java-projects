/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingsort2;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Countingsort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,1,3,2,1};
        System.out.println(Arrays.toString(countingSort(arr)));
    }
    static int[] countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println();
        int[] a = new int[max+1];
        for(int i = 0 ; i < arr.length ; i++) {
            a[arr[i]]++;
        }
        int[] b = new int[arr.length];
        int j = 0;
        for(int i = 0 ; i < a.length ; i++) {
            if(a[i] > 0) {
                for(int k = 0 ; k < a[i] ; k++) {
                    b[j] = i;
                    j++;
                }
            }
        }
        return b;
    }
}
