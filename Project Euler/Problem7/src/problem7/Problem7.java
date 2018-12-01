/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem7;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class Problem7 {
    public static ArrayList<Integer> l = new ArrayList<Integer>();
    public static void checkPrime(int num) {
        
        Boolean isTemp = true;
        for(int i=2;i<=num/2;i++) {
            if(num%i==0) {
                isTemp = false;
                break;
            }
            
        }
        if(isTemp == true) {
            l.add(num);
        }

        /*Boolean isTemp = true;
        int j = 2;
        while(j > 1) {
            for(int i=2;i<=j/2;i++) {
                if(j%i==0) {
                    isTemp = false;
                    break;
                }

            }
            if(isTemp == true) {
                l.add(j);
            }
            j++;
            if(l.size() > 10001) {
                break;
            }
        }    
        System.out.println(l);*/
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int j = 3 ; j < 100000000 ; j += 2) {
            checkPrime(j);
        }
        System.out.println(l.get(456));
    }
    
}
