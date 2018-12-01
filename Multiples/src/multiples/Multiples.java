/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if(n1 > n2) {
            if (n1 % n2==0) {
                System.out.println(n1 + " is a multiple of " + n2);
            }
            else {
                System.out.println("No multiple found");
            }
        }
        else {
            if (n2 % n1==0) {
                System.out.println(n1 + " is a multiple of " + n2);
            }
            else {
                System.out.println("No multiple found");
            }
        }
    }
    
}
