/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkmultiple;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class CheckMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the bigger number: ");
        int b = input.nextInt();
        System.out.println("Enter the smaller number: ");
        int a = input.nextInt();
        boolean result = isMultiple(a,b);
        System.out.println(result);
    }
    public static boolean isMultiple(int x, int y) {
        if (y%x==0)
            return true;
        else
            return false;
    }
    
}
