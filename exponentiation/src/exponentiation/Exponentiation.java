/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentiation;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Exponentiation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int a = input.nextInt();
        System.out.println("Enter the exponent: ");
        int b = input.nextInt();
        int answer = integerPower(a,b);
        System.out.println("The result is " + answer);
    }
    public static int integerPower(int base , int exp) {
        int result = 1;
        for(int i = 1;i <= exp;i++) {
            result *= base;
        }
        return result;
    }
}
