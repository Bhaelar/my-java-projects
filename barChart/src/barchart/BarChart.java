/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchart;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e,i;
        System.out.println("Enter the values of five numbers ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        
        System.out.printf(a+"   ");
        for (i=1;i<=a;i++) {
            System.out.printf("*");
        }
        System.out.println();
        
        System.out.print(b+"   ");
        for (i=1;i<=b;i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print(c+"   ");
        for (i=1;i<=c;i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print(d+"   ");
        for (i=1;i<=d;i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print(e+"   ");
        for (i=1;i<=e;i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
