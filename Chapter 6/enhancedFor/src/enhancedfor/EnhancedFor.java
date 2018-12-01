/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedfor;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class EnhancedFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers are you adding: ");
        int no = input.nextInt();
        double val,total = 0;
        int [] arr = new int[no];
        System.out.println("Enter the numbers");
        for(int value : arr) {
            
            val = input.nextDouble();
            total += val;
        }
        System.out.println("Total is " + total);
    }
    
}
