/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-digit number :");
        String s = input.nextLine();
        if (s.length() != 4 ) {
            System.out.println("Enter a valid number!");
        } else {
            int t = Integer.parseInt(s);
            int n1 = t/1000;
            int n2 = (t / 100) % 10;
            int n3 = (t/10) % 10;
            int n4 = (t % 10);
            
            n1 = (n1 + 7)%10;
            n2 = (n2 + 7)%10;
            n3 = (n3 + 7)%10;
            n4 = (n4 + 7)%10;
            
            int e = n1;
            int f = n2;
            int g = n3;
            int h = n4;
            n1 = g;
            n2 = h;
            n3 = e;
            n4 = f;
            
            System.out.print(n1);
            System.out.print(n2);
            System.out.print(n3);
            System.out.print(n4);
            System.out.println();
            
        }
        
        
        
    }
    
}
