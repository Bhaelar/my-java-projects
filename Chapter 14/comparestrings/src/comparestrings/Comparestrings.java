/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparestrings;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Comparestrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words to compare");
        String a = input.nextLine();
        String b = input.nextLine();
        compare(a,b);
    }
    public static void compare(String word1 , String word2) {
        if(word1.compareTo(word2) == 1) {
            System.out.println(word1 + " is greater than " + word2);
        }
        if(word1.compareTo(word2) == -1) {
            System.out.println(word1 + " is less than " + word2);
        }
        if(word1.compareTo(word2) == 0) {
            System.out.println(word1 + " is equal to " + word2);
        }
    }
}
