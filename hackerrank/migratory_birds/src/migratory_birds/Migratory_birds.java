/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package migratory_birds;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Migratory_birds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ar = {1, 4, 4, 4 ,5 , 3, 2, 2 , 2, 2, 4, 5, 5,3};
        System.out.println(migratoryBirds(ar));
    }
    static int migratoryBirds(int[] ar) {
        
        int[] check = {1,2,3,4,5};
        int index = 0;
        int[] list = new int [5];
        for(int i = 0 ; i < check.length ; i++) {
            int count = 0;
            for(int j = 0 ; j < ar.length ; j++) {
                if(check[i] == ar[j]) {
                    ++count;
                }
            }
            list[i] = count;
        }
        System.out.println(Arrays.toString(list));
        int max = 0;
        max = list[0]; 
        for(int i = 0 ; i < list.length ; i++) {
            if(list[i] > max) {
                max = list[i];
            }
        }
        for(int i = 0 ; i < list.length ; i++) {
            if(list[i] == max) {
                index = i + 1 ;
                break;
            }
        }
        return index;
    }
}
