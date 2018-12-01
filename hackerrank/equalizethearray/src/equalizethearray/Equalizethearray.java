/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalizethearray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Equalizethearray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {37, 32, 97, 35, 76, 62};
        int a = equalizearray(arr);
        System.out.println(a);
    }
    static int equalizearray(int[] arr) {
        int[] arrcount = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++) {
            int count = 0;
            for(int j = 0 ; j < arr.length ; j++) {
                if(arr[i] == arr[j]) {
                    ++count;
                }
            }
            arrcount[i] = count;
        }
        
        int max = arrcount[0];
        for(int i = 0 ; i < arrcount.length ; i++) {
            if(arrcount[i] > max) {
                max = arrcount[i];
            }
        }
        int count1 = 0;
        for(int i = 0 ; i < arrcount.length ; i++) {
            if(arrcount[i] == max) {
                ++count1;
            }
        }
        if(count1 == arrcount.length) {
            return arrcount.length - 1;
        }
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        for(int i = 0 ; i < arrcount.length ; i++) {
            if(arrcount[i] == max) {
                newlist.add(arr[i]);
            }
        }
        return arr.length - newlist.size();
    }
}
