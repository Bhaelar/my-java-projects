/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort1;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class Quicksort1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static int[] quickSort(int[] arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int p = arr[0];
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] < p) {
                a.add(arr[i]);
            }
        }
        a.add(p);
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > p) {
                a.add(arr[i]);
            }
        }
        int[] b = new int[a.size()];
        for(int i = 0 ; i < a.size() ; i++) {
            b[i] = a.get(i);
        }
        return b;
    }
}
