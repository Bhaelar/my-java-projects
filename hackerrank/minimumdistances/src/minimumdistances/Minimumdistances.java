/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumdistances;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Minimumdistances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {7, 1, 3, 4, 1, 7};
        System.out.println(minimumDistances(a));
    }
    static int minimumDistances(int[] a) {
        ArrayList <Integer> list = new ArrayList<> ();
        
        for(int i = 0 ; i < a.length ; i++) {
            for(int j = i + 1 ; j < a.length ; j++ ) {
                if(a[i] == a[j]) {
                    int diff = Math.abs(i-j);
                    list.add(diff);
                }
            }
        }
        if(list.size() > 0) {
            Collections.sort(list);
            return list.get(0);
        }
        return -1;
    }
}
