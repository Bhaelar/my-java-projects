/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betweentwosets;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Modupe Okenla
 */
public class BetweenTwoSets {

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
        Boolean check = true;
        for(int i = a[0] ; i <= b[0] ; i++) {
            for(int j = 0 ; j < a.length ; j++) {
                if(i % a[j] != 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                list.add(i);
            }
        }
        System.out.println(list);
        for(int i = 0 ; i < list.size() ; i++) {
            for(int j = 0 ; j < b.length ; j++) {
                if(b[j] % list.get(i) != 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                list1.add(list.get(i));
            }
        }
        return list1.size();
    }
}
