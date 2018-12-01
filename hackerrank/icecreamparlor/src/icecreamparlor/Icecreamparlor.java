/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamparlor;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Icecreamparlor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,3,4,5,6};
        System.out.println(Arrays.toString(icecreamParlor(6,arr)));
    }
    static int[] icecreamParlor(int m, int[] arr) {
        int result [] = new int [2];
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(i != j) {
                    if(arr[i] + arr[j] == m) {
                        result[0] = i+1;
                        result[1] = j+1;
                    }
                }
            }
            if(result[0] > 0) {
                break;
            }
        }
        return result;

    }
}
