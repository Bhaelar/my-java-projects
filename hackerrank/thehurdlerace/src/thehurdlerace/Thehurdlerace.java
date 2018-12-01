/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehurdlerace;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Thehurdlerace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = {1,6,5,3,2};
        System.out.println(hurdleRace(4,a));
    }
    static int hurdleRace(int k, int[] height) {
        int count = 0;
        Arrays.sort(height);
        if(height[height.length - 1] > k) {
            count = height[height.length - 1] - k;
        }
        return count;
    }
}
