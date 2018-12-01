/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem10;

/**
 *
 * @author Modupe Okenla
 */
public class Problem10 {
    public static boolean isPrime(long n) {
        Boolean is = null;
        if (n < 2) 
            is = false;
        else if (n == 2) 
            is = true;
        for ( int i = 2 ; i < Math.pow( n , 0.5) + 1 ; i++ ) {
            if(n%i==0)
                is = false;
            else
                is = true;
        }
        return is;
    }
    /*public static int checkPrime(int num) {
        int l = 0;
        Boolean isTemp = true;
        for(int i=2;i<  Math.pow(num,0.5)+ 1;i++) {
            if(num%i==0) {
                isTemp = false;
                break;
            }
            
        }
        if(isTemp == true) {
            l = num;
        }
        return l;    
    } */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int sum = 0;
        for (int j = 0 ; j < 2000000 ; j++) {
            sum += checkPrime(j);
        }
        System.out.println(sum);
*/
        long sum = 0;
        for ( int i = 3 ; i < 2000000 ; i += 2) {
            if (isPrime(i))
                sum += i;
            
        }
        System.out.println(sum);
    }
    
}
