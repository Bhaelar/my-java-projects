/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picking_numbers;
import java.util.ArrayList;
/**
 *
 * @author Modupe Okenla
 */
public class Picking_numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] b = {1,2,2,3,1,2};
        System.out.println(pickingNumbers(b));
    }
    static int pickingNumbers(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0 ; i < a.length ; i++) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            for(int j = 0 ; j < a.length ; j++) {
                
                if(a[i] - a[j] == 1 || a[i] - a[j] == 0) {
                    list1.add(a[j]);
                }
            }
            list.add(list1.size());
        }
        int l = list.get(0);
        for(int i = 0 ; i < list.size() ; i++) {
            if(list.get(i) > l) {
                l = list.get(i);
            }
        }
        int[] b = {l};
        return l;
    }
}
