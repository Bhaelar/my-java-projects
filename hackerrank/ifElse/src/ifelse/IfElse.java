/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if((N % 2 != 0) || ((N % 2 == 0) && (N <= 20) && (N >= 6))) {
            System.out.println("Weird");
        }
        if(((N % 2 == 0) && (N <=5) && (N >= 2)) || ((N % 2 == 0) && (N > 20))) {
            System.out.println("Not Weird");
        }
    }
    
}
