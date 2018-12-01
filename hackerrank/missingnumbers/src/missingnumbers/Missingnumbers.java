/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Missingnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] brr = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
        System.out.println(Arrays.toString(missingNumbers(arr,brr)));
    }
    static int[] missingNumbers(int[] arr, int[] brr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> checklist = new ArrayList<Integer>();
        for(int i = 0 ; i < brr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                int b = 0;
                for(int k = 0 ; k < checklist.size() ; k++) {
                    if(brr[i] == checklist.get(k)) {
                        b++;
                    }
                }
                if(b > 0) {
                    break;
                }
                if(brr[i] == arr[j]) {
                    if(occur(brr[i],brr) != occur(arr[j],arr)) {
                        int a = (Math.abs(occur(brr[i],brr) - occur(arr[j],arr)));
                        for(int k = 0 ; k < a ; k++) {
                            result.add(brr[i]);
                            //System.out.println("result   " + result);
                        }
                    }
                    checklist.add(brr[i]);
                    //System.out.println("checklist   " + checklist);
                    break;
                }
                if(j == arr.length - 1) {
                    int a = (occur(brr[i],brr));
                        for(int k = 0 ; k < a ; k++) {
                            result.add(brr[i]);
                            //System.out.println("result   " + result);
                        }
                    checklist.add(brr[i]);
                    //System.out.println("checklist   " + checklist);
                }
            }
        }
        Collections.sort(result);
        int[] result1 = new int[result.size()];
        for(int i = 0 ; i < result.size() ; i++) {
            result1[i] = result.get(i);
        }
        return result1;
    }
    static int occur(int a , int[] arr) {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(a == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
