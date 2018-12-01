/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversion;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class TempConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temp in celsius or fahrenheit: ");
        double temp = input.nextDouble();
        System.out.println("To convert from cel to fahr,press 1/nTo convert from fahr to cel press 2");
        int option = input.nextInt();
        if(option == 1) {
            System.out.println("Temperature in fahrenheit is " + fahrenheit(temp));
        }
        if(option == 2) {
            System.out.println("Temperature in celsius is " + celsius(temp));
        }
        else {
            System.out.println("Enter a valid number");
        }
    }
    public static double celsius(double fahr) {
        double cel = 5.0 / 9.0 * (fahr - 32);
        return cel;
    }
    public static double fahrenheit(double cel) {
        double fahr = 9.0 / 5.0 * cel + 32;
        return fahr;
    }
}
