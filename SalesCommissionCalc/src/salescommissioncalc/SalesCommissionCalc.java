/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salescommissioncalc;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class SalesCommissionCalc {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int salaryPerWeek = 200;
        
        System.out.println("Enter no. of items sold: ");
        int items = input.nextInt();
        double total = 0;
        System.out.println("Enter the price of each item: ");
        for (int i=0;i<items;i++) {
            
            double price = input.nextDouble();
            
            total += price;
        }
        
        
        double commission = 9 * total / 100;
        double TotalSalary = salaryPerWeek + commission;
        System.out.println("Your total salary is " + TotalSalary);
        
    }
    
}
