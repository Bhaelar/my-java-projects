/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsreview;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Letsreview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        String [] words = new String[no];
        for(int i = 1 ; i <= words.length ; i++) {
            
            words[i] = input.nextLine();
            input.next();
        }
        for(int i = 0 ; i < words.length ; i++) {
            
            String even = "";
            String odd= "";
            String[] list = words[i].split("");
            for(int j = 0 ; j < words[i].length() ; j++) {
                if(j == 0) {
                    even += list[j];
                    continue;
                }
                else if(j == 1) {
                    odd += list[j];
                    continue;
                }
                else if(j % 2 == 0) {
                    even += list[j];
                } else {
                    odd += list[j];
                }
            }
            System.out.println(even + " " + odd);
        }
    }
    
}
