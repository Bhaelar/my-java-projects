/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayingsentencewithwordsreversed;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Displayingsentencewithwordsreversed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String text = input.nextLine();
        convert(text);
    }
    public static void convert(String word) {
        String[] token = word.split(" ");
        for (String l : token) {
            for(int i = l.length() - 1 ; i >= 0 ; i--) {
                System.out.print(l.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
