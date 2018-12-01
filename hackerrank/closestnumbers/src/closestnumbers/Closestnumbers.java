/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closestnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Closestnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {-5, 15, 25, 71, 63 };
        System.out.println(Arrays.toString(closestNumbers(a)));
    }
    static int[] closestNumbers(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(i != j) {
                    ans.add(Math.abs(arr[j] - arr[i]));
                }
            } 
        }
        int value = Collections.min(ans);
        System.out.println(value);
        ArrayList<Integer> ans1 = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(i != j) {
                    if(Math.abs(arr[j] - arr[i]) == value) {
                        //ans1.add(arr[j]);
                        ans1.add(arr[i]);
                    }
                }
            } 
        }
        Collections.sort(ans1);
        int[] a = new int[ans1.size()];
        for(int i = 0 ; i < a.length ; i++) {
            a[i] = ans1.get(i);
        }
        return a;
    }
}
