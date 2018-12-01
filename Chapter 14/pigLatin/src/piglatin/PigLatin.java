/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = input.nextLine();
        convert(sentence);
    }
    public static void convert(String word) {
        String[] tokens = word.split(" ");
        
        for(String l : tokens) {
            String result = "";
            result += l.substring(1,l.length()) + l.charAt(0) + "ay";
            System.out.println(result);
        }
    }
}
