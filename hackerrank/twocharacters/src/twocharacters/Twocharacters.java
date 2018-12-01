/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twocharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Twocharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(alternate("beabeefeab"));
    }
    static int alternate(String s) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add(s.substring(0,1));
        for(int i = 0 ; i < s.length() ; i++) {
            int a = 0;
            for(int j = 0 ; j < arr1.size() ; j++) {
                if(s.substring(i,i+1).equals(arr1.get(j))) {
                    a++;
                }
            }
            if(a > 0) {
                continue;
            }
            arr1.add(s.substring(i,i+1));
        }
        for(int i = 0 ; i < arr1.size() ; i++) {
            //System.out.println(arr1.get(i));
        }
        int[] arr2 = new int [arr1.size()];
        for(int i = 0 ; i < arr1.size() ; i++) {
            int a = 0;
            for(int j = 0 ; j < s.length() ; j++) {
                if(arr1.get(i).equals(s.substring(j,j+1))) {
                    a++;
                }
            }
            arr2[i] = a;
        }
        //System.out.println(Arrays.toString(arr2));
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        for(int i = 0 ; i < arr2.length ; i++) {
            String s1 = s;
            
            for(int j = i + 1 ; j < arr1.size() ; j++) {
                String s2 = "";
                for(int k = 0 ; k < s1.length() ; k++) {
                    if(s1.substring(k,k + 1).equals(arr1.get(i)) || s1.substring(k,k + 1).equals(arr1.get(j))) {
                        s2 += s1.substring(k,k+1);
                    }
                }
                //System.out.println(s2);
                int b = 0;
                for(int l = 0 ; l < s2.length() - 1 ; l++) {
                    int a = 0;
                    if(s2.charAt(l) == s2.charAt(l + 1)) {
                        a++;
                    }
                    b = a;
                    if(a > 0) {
                        break;
                    }
                }
                if(b == 0) {
                    arr3.add(s2.length());
                }
            }
        }
        if(arr3.size() > 0) {
            return Collections.max(arr3);
        }
        return 0;
    }
}
