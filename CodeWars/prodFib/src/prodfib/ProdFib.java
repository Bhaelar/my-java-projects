/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodfib;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class ProdFib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        productFib(800L);
    }
    public static long[] productFib(long prod) {
    // your code
        //ArrayList<Long> fib = new ArrayList<Long>();
        long [] fib = new long[(int)prod/2];
        //ArrayList<Long> answer = new ArrayList<Long>();
        long [] answer = new long[3];
        long n = 2;
        long fibs = 0;
        fib[0] = 0l;
        fib[1] = 1l;
        while(n >= 0) {
            fibs = fib[(int) (n-2l)] + fib[(int) (n-1l)];
            fib[(int)n] = fibs;
            if (fibs > prod / 4) {
                break;
            }
            
            n++ ; 
        }
        for (int i = 0 ; i < fib.length ; i++) {
            if(prod == (fib[i] * fib[i+1])) {
                Boolean isTrue = true;
                answer[0] = fib[i];
                answer[1] = fib[i+1];
                answer[2] = 1l;
                break;
            }
            else {
                if(prod < (fib[i] * fib[i+1])) {
                    answer[0] = fib[i];
                    answer[1] = fib[i+1];
                    answer[2] = 0l;
                    break;
                }
            }
        }
        for (int j = 0 ; j < answer.length ; j++) {
            System.out.println(answer[j]);
        }
        return answer;
        
   }
}
