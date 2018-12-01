/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;
import java.util.Scanner;

/**
 *
 * @author Modupe Okenla
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in metres: ");
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("Your BMI is "+BMI);
        
    }
    
}
