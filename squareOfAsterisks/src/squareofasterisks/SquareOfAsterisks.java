/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareofasterisks;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class SquareOfAsterisks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side: ");
        int a = input.nextInt();
        System.out.println("Enter character: ");
        char fill = input.next().charAt(0);
        SquareOfAsterisks.printAsteriks(fill,a);
    }
    public static void printAsteriks(char fill,int side) {
        for (int i=1;i<=side;i++) {
            for (int j=1;j<=side;j++) {
                System.out.print(fill);
                
            }
            System.out.println();
        }
    }
    
}
