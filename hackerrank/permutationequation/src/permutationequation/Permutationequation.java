/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationequation;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Permutationequation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] p = {2,3,1};
        System.out.println(Arrays.toString(permutationEquation(p)));
    }
    static int[] permutationEquation(int[] p) {
        int[] a = new int[p.length];
        for(int i = 1 ; i <= p.length ; i++) {
            for(int j = 0 ; j < p.length ; j++) {
                if(i == p[j]) {
                    for(int k = 0 ; k < p.length ; k++) {
                        if(j + 1 == p[k])
                            a[i-1] = k + 1;
                    }
                }
            }
        }
        return a;
    }
}
