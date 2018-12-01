/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findminimum;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class FindMinimum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        FindMinimum.minimum3(a,b,c);
    }
    public static void minimum3(double a,double b,double c) {
        double minimum = Math.min(a,Math.min(b,c));
        System.out.println("Minimum number is " + minimum);
    }
}
