/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isprime;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class IsPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*for(int i=1;i<10000;i++) {
            checkPrime(i);
        }*/
        checkPrime(997);
    }
    public static void checkPrime(int num) {
        Boolean isTemp = true;
        for(int i=2;i<=num/2;i++) {
            if(num%i==0) {
                isTemp = false;
                break;
            }
            
        }
        if(isTemp == true) {
            System.out.println(num + " is prime");
        }
            
    }
}
