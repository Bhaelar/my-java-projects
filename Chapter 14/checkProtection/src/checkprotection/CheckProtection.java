/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkprotection;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class CheckProtection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dollar amount in the format XXXX-XX");
        String amount = input.nextLine();
        protect(amount);
    }
    public static void protect(String amount) {
        String[] tokens = amount.split("-");
        String[] cheque = new String[9];
        String l = "";
        if(tokens[0].length() > 3) {
            l += tokens[0].substring(0,tokens[0].length()-3) + "," + tokens[0].substring(tokens[0].length()-3);
        } else {
            l += tokens[0];
        }
        String doll = l + "." + tokens[1];
        if(doll.length() < 9) {
            int i = 9 - doll.length();
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.print(doll);
        }
        else {
            System.out.println(doll);
        }
    }
}
