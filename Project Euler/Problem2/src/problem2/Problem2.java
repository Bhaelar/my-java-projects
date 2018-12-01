/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;
import java.util.ArrayList;
/**
 *
 * @author Modupe Okenla
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> items = new ArrayList<Integer>();
        int i1 = 1;
        int i2 = 2;
        int j;
        int sum = 0;
        items.add(i1);
        items.add(i2);
        System.out.println(items.get(2-2) + items.get(2-1));
        for(int i = 2; i < 9999 ; i++) {
            
            j = items.get(i-2) + items.get(i-1);
            if (j>4000000) {
                break;
            }
             items.add(j);
            
          
        }
        System.out.println(items);
        for(int i = 0; i < items.size();i++ ) {
            if(items.get(i)%2 == 0) {
                
                sum += items.get(i);
            }
        }
        System.out.println(sum);
    }
    
}
