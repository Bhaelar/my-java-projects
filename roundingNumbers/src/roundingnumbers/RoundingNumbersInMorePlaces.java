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
public class RoundingNumbersInMorePlaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        
        System.out.println("Number to nearest int:" + toInt(a));
        System.out.println("Number to nearest tenths:" + toTenths(a));
        System.out.println("Number to nearest hundredths:" + toHundredths(a));
        System.out.println("Number to nearest thousandths:" + toThousandths(a));
    }
    public static double toInt(double x) {
        double y = Math.floor(x + 0.5);
        return y;
    }
    public static double toTenths(double x) {
        double y = Math.floor(x*10 + 0.5) / 10;
        return y;
    }
    public static double toHundredths(double x) {
        double y = Math.floor(x*100 + 0.5) / 100;
        return y;
    }
    public static double toThousandths(double x) {
        double y = Math.floor(x*1000 + 0.5) / 1000;
        return y;
    }
}
