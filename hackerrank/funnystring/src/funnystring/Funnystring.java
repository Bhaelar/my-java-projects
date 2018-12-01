/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funnystring;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Funnystring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(funnyString("bcxz"));
    }
    static String funnyString(String s) {
        int[] arr1 = new int[s.length()];
        int[] arr2 = new int[s.length()];
        int x = s.length() - 1;
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            int a = (int) c;
            arr1[i] = a;
            char d = s.charAt(x);
            int b = (int) d;
            arr2[i] = b;
            x--;
        }
        for(int i = 1 ; i < arr1.length ; i++) {
            int a = Math.abs(arr1[i] - arr1[i-1]);
            int b = Math.abs(arr2[i] - arr2[i-1]);
            if(a != b) {
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
