/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flatland;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Flatland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] c ={0,4};
        System.out.println(flatlandSpaceStations(5,c));
    }
    static int flatlandSpaceStations(int n, int[] c) {
        
        ArrayList<Integer> count = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i++) {
            ArrayList<Integer> count1 = new ArrayList<Integer>();
            for(int j = 0 ; j < c.length ; j++) {
                int a = Math.abs(i - c[j]);
                count1.add(a);
            }
            Collections.sort(count1);
            count.add(count1.get(0));
        }
        Collections.sort(count);
        return count.get(count.size() - 1);
    }
}
