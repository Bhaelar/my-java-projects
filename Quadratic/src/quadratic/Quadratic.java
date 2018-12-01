/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Modupe Okenla
 */
public class Quadratic {
    
    public static void quad(int a,int b,int c) {
        
        double quadr1 = (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        double quadr2 = (-b - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        System.out.println("Quadratic equation = " +quadr1 + " and "+quadr2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quadratic formula calculator");
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a,b,c: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        quad(a,b,c);
    }
    
}
