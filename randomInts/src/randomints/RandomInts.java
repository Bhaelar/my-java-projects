/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomints;
import java.security.SecureRandom;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class RandomInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your limits: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int ran = setLimit(x,y);
        System.out.println("Random number: " + ran);
    }
    public static int setLimit(int a,int b) {
        SecureRandom randomNumber = new SecureRandom();
        int random = a + randomNumber.nextInt(b);
        return random;
    }
}
