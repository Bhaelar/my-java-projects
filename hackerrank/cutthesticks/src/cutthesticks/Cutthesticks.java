/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutthesticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Cutthesticks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] l = {1,2,3,4,3,3,2,1};
        System.out.println(Arrays.toString(cutTheSticks(l)));
    }
    static int[] cutTheSticks(int[] arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length ; i++) {
            b.add(arr[i]);
        }
        while(arr.length > 0) {
            int min = b.get(0);
            for(int i = 0 ; i < b.size() ; i++) {
                if(b.get(i) < min) {
                    min = b.get(i);
                }
            }
            a.add(b.size());
            for(int i = 0 ; i < b.size() ; i++) {
                b.set(i,b.get(i) - min);
                //System.out.println("b"+i +" " + b.get(i));
            }
            b.removeAll(Collections.singleton(0));
            if(b.isEmpty()) {
                break;
            }
        }
        int[] c = new int[a.size()];
        for(int i = 0 ; i < c.length ; i++) {
            c[i] = a.get(i);
        }
        return c;
    }
}
