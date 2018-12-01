/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calchypotenus;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class CalcHypotenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        double a = input.nextDouble();
        System.out.println("Enter side 2: ");
        double b = input.nextDouble();
        double result = calc(a,b);
        System.out.println("The result is " + result);
    }
    public static double calc(double side1 , double side2) {
        double hyp = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2 , 2));
        return hyp;
    }
}
