/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectnumbers;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class PerfectNumbers {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(isPerfect(num)) {
            System.out.println(num + " is a perfect number");
            for(int i=1;i<num;i++) {
                if(num % i == 0) {
                    System.out.println(i + " ");
                }
            }
        }
        else {
            System.out.println("Not a perfect number");
        }
    }
    public static boolean isPerfect(int number) {
        int sum = 1;
        for(int i=1;i<number;i++) {
            if(number % i == 0) {
                
                sum += i;
            }
            
        }
        return sum == number;
        
    }
}
