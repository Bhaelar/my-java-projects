/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Modupe Okenla
 */
public class Fibonacci {
    public static long F(int N)
    {
        if (N == 0) 
            return 0;
        if (N == 1)
            return 1;
        return F(N-1) + F(N-2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long[] list = new long[100];
        for (int N = 0; N < 100; N++) {
            list[N] = F(N);
            System.out.println(N + " " + list[N]);
        }
    }
    
}
