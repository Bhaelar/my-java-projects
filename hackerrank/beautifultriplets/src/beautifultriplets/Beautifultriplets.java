/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautifultriplets;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class Beautifultriplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1, 2, 4, 5, 7, 8, 10};
        System.out.println(beautifulTriplets(3,arr));
    }
    static int beautifulTriplets(int d, int[] arr) {
        ArrayList<Integer> list = new ArrayList <Integer> ();
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i + 1 ; j < arr.length ; j++) {
                for(int k = j + 1 ; k < arr.length ; k++) {
                    ArrayList<Integer> list1 = new ArrayList<Integer> ();
                    if(k > j && j > i && arr[j] - arr[i] == d && arr[k] - arr[j] == d) {
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                    }
                }
            }
        }
        //System.out.println(list);
        return list.size() / 3;
    }
}
