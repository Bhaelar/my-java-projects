/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

/**
 *
 * @author Modupe Okenla
 */
public class Problem6 {
    public static int sumSquare() {
        int sum = 0;
        for (int i = 1 ; i < 101 ; i++) {
            sum += Math.pow(i,2);
        }
        return sum;
    }
    
    public static int squareSum() {
        int sum1 = 0;
        for (int j = 1 ; j < 101 ; j++) {
            sum1 += j;
        }
        return sum1 * sum1;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int difference;
        difference = squareSum() - sumSquare();
        System.out.println(difference);
    }
    
}
