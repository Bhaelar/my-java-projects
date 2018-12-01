/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairrations;

/**
 *
 * @author Modupe Okenla
 */
public class Fairrations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] b ={2,3,4,5,6};
        System.out.println(fairRations(b));
    }
    static int fairRations(int[] B) {
        int times = 0;
        while(1 > 0) {
            int evens = 0;
            for(int i = 0 ; i < B.length ; i++) {
                if(B[i] % 2 == 0) {
                    ++evens;
                }
                if(B[i] % 2 != 0) {
                   B[i] += 1; times++;
                   if(i > 0) {
                       if(B[i + 1] % 2 != 0) {
                           B[i + 1] += 1; times++;
                       } else {
                            B[i - 1] += 1 ; times++;
                       }
                   }
                   if(i == 0) {
                       B[i + 1] += 1 ; times++;
                   }
                   break;
                } 
            } 
            if(evens == B.length) {
                break;
            }
        }
        return times;
    }
}
