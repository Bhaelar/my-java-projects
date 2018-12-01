/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extralongfactorial;
import java.math.BigInteger;
/**
 *
 * @author Modupe Okenla
 */
public class ExtraLongFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        extraLongFactorials(25);
    }
    
    static void extraLongFactorials(int n) {
        BigInteger number = BigInteger.ONE;
        for(int i = 1 ; i <= n ; i++) {
            number = number.multiply(BigInteger.valueOf(i)) ;
        }
        System.out.println(number);
    }
}
