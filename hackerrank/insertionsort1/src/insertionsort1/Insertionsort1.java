/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort1;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Insertionsort1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {2,4,6,8,3};
        insertionSort1(5,arr);
    }
    static void insertionSort1(int n, int[] arr) {
        int a = arr[n -1];
        for(int i = n-1 ; i >= 0 ; i--) {
            if(a > arr[0]) {
                if(a < arr[i - 1] ) {
                    arr[i] = arr[i -1];
                    for(int j = 0 ; j < arr.length ; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                } else{
                    arr[i] = a;
                    for(int j = 0 ; j < arr.length ; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    break;
                }
            } else {
                if(i - 1 >= 0) {
                    arr[i] = arr[i -1];
                        for(int j = 0 ; j < arr.length ; j++) {
                            System.out.print(arr[j] + " ");
                        }
                    System.out.println();
                } else {
                    arr[0] = a;
                    for(int j = 0 ; j < arr.length ; j++) {
                            System.out.print(arr[j] + " ");
                        }
                    System.out.println();
                }
            }
        }

    }
}
