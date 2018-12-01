/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seperatingintegers;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class SeperatingIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 5-digit integer: ");
        int number = input.nextInt();
        int n1 = number / 10000;
        int n2 = (number % 10000) / 1000;
        int n3 = (number % 1000) / 100;
        int n4 = (number % 100) / 10;
        int n5 = (number % 10);
        
        System.out.println(n1+"   "+n2+"   "+n3+"   "+n4+"   "+n5);
        
    }
    
}
