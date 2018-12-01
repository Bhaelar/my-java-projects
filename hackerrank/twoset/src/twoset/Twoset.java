/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoset;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Modupe Okenla
 */
public class Twoset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {2,4};
        int[] b = {16,32,96};
        System.out.println(getTotalX(a,b));

    }
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Arrays.sort(a);
        Arrays.sort(b);
        
        
        for(int i = a[0] ; i <= b[0] ; i++) {
            int check = 0;
            for(int j = 0 ; j < a.length ; j++) {
                if(i % a[j] != 0) {
                    ++check;
                    
                }
            }
            
            if(check == 0) {
                list.add(i);
            }
        }
        
        for(int i = 0 ; i < list.size() ; i++) {
            int check = 0;
            for(int j = 0 ; j < b.length ; j++) {
                if(b[j] % list.get(i) != 0) {
                    ++check;
                   
                }
            }
            if(check == 0) {
                list1.add(list.get(i));
            }
        }
        return list1.size();
    }
}
