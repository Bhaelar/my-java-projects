/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundingnumbers;
import java.util.Scanner;

/**
 *
 * @author Modupe Okenla
 */
public class RoundingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double result = toInt(a);
        System.out.println(result);
    }
    public static double toInt(double x) {
        double y = Math.floor(x + 0.5);
        return y;
    }
    
}
