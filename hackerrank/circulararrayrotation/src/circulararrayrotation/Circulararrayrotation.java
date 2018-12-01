/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararrayrotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Modupe Okenla
 */
public class Circulararrayrotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        for(int i = 0 ; i < queries.length ; i++) {
            if(queries[i] > k) {
                return k - queries[i];
            }
        }
    }
}
