/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textanalysis;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class TextAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = input.nextLine();
        convert1(text);
        convert2(text);
    }
    public static void convert1(String text) {
        String[] tokens = text.split("");
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabets = alpha.split("");
        System.out.println("Alphabet\tOccurence");
        for(int i = 0 ; i < alphabets.length ; i++) {
            int count = 0;
            for (int j = 0 ; j < tokens.length ; j++) {
                if(alphabets[i].equals(tokens[j])) {
                    ++count;
                }
            }
            System.out.println(alphabets[i] + "\t\t" + count);
        }
    }
    public static void convert2(String text) {
        String[] tokens = text.split(" ");
        System.out.println("Letter-Word\tOccurence");
        int[] word = new int[10];
        for (int i = 1 ; i <11 ; i++ ) {
            int count = 0;
            for (int j = 0 ;j < tokens.length ; j++ ) {
                if(tokens[j].length() == i) {
                    ++count;
                }
            }
            word[i-1] = count;
            System.out.println(i + "\t\t" + word[i-1] );
        }
    }
}
