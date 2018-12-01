/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareportionsofstring;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class ComparePortionsOfString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words to compare");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        int a = input.nextInt();
        int b = input.nextInt();
        compare(word1 , word2 , a , b);
    }
    public static void compare(String word1 , String word2 , int a , int b) {
        if(word1.regionMatches(true , a-1 , word2 , a-1 , b)) {
            System.out.println("Characters " + a + " to " + (a-1+b) + " are equal for both strings");
        } else {
            System.out.println("Characters " + a + " to " + (a-1+b) + " aren't equal for both strings");
        }
    }
}
