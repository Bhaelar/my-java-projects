/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingsort1;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Countingsort1 {

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
        return a;
    }
}
