/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingsales;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class CalculatingSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int prodNo,quanSold;
        
        while(input.hasNext()) {
            double price = 0;
            double tot = 0;
            System.out.println("Enter product number:");
            prodNo = input.nextInt();
            System.out.println("Enter quantity sold:");
            quanSold = input.nextInt();
            switch (prodNo) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    System.out.println("Enter a valid number");
                    
            }
            tot = tot + price;
        }
        
        System.out.println("  " + tot);
    }
    
}
