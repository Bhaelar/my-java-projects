/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveoferas;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class SieveOfEras {
    public static int n;
    static ArrayList <Integer> primenumbers = new ArrayList <Integer> ();
    public static void prime(int n) {
        int total = 0;
        Boolean[] primeArray = new Boolean[n];
        Arrays.fill(primeArray,true);
        for (int m = 0 ; m < n ; m++) {
            primeArray[m] = true;
        }
        //System.out.println(primeArray[898]);
        for (int i = 2 ; i < n ; i++) {
            if(primeArray[i] == true) {
                for (int l = i+1 ; l < n ; l++) {
                    if(l % i == 0) {
                        primeArray[l] = false;
                        //System.out.println(l);
                    }
                }
            }
        }
        for ( int k = 2 ; k < n ; k++) {
            
            if(primeArray[k] == true) {
                primenumbers.add(k);
            }
        }
        for(int j = 0 ; j < primenumbers.size() ; j++) {
            total += primenumbers.get(j);
        }
        System.out.println(primenumbers);
        System.out.println(total);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        prime(2000000);
    }
    
}
