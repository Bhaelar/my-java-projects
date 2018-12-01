/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsshop;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class ElectronicsShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int max = 0;
        ArrayList<Integer> options = new ArrayList<Integer>();
        for(int i = 0 ; i < drives.length ; i++) {
            for(int j = 0 ; j < keyboards.length ; j++) {
                if(drives[i] + keyboards[j] <= b) {
                    options.add(drives[i] + keyboards[j]);
                }
            }
        }
        if(options.size() == 0) {
            return -1;
        } else {
            max = options.get(0);
            for(int i = 0 ; i < options.size() ; i++) {
                if(options.get(i) > max) {
                    max = options.get(i);
                }
            }
            return max;
        }
    }
}
