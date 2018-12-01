/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort2;

/**
 *
 * @author Modupe Okenla
 */
public class Insertionsort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1, 4, 3, 5, 6, 2};
        insertionSort2(6, arr);
    }
    static void insertionSort2(int n, int[] arr) {
        int shift = 0;
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value){
                arr[j + 1] = arr[j];
                j = j - 1;
                shift++;
            }
            arr[j + 1] = value;
            printArray(arr);
            System.out.println();
        }
        System.out.println(shift);
        

    }
    
    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
}
