/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizingtelephonenumbers;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Tokenizingtelephonenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter telephone number in the format (555) 555-5555");
        String telephone = input.nextLine();
        tokenize(telephone);
    }
    public static void tokenize(String telephone) {
        String[] token = telephone.split(" ");
        String[] tokens = token[1].split("-");
        System.out.println("Area code: " + token[0]);
        System.out.println("Number: " + tokens[0] + tokens[1]);
    }
}
