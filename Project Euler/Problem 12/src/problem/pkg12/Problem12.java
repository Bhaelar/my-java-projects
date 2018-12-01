/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg12;
import java.util.ArrayList;
/**
 *
 * @author Modupe Okenla
 */
public class Problem12 {
static ArrayList <Integer> factors = new ArrayList <Integer> ();
static ArrayList <Integer> factor = new ArrayList <Integer> ();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getIt();
    }
    public static void getIt() {
        int i = 1;
        
        while(i >= 1) {
            int k = 0;
            int count = 0;
            for(int j = 1 ; j <= i ; j++) {
                k += j;
            }
            factors.add(k);
            for (int l = 1 ; l <= k ; l++) {
                if(k % l == 0) {
                    ++count;
                }
            }
            factor.add(count);
            i++;
            if(count > 500) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(factors);
        System.out.println(factor);
        
    }
    
}
