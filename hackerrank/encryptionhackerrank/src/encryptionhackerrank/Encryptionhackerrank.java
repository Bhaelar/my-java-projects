/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptionhackerrank;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Encryptionhackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(encryption("iffactsdontfittotheorychangethefacts"));
        
    }
    static String encryption(String s) {
        String word = "";
        for(int i = 0 ; i < s.length() ; i++) {
            if(!s.substring(i,i+1).equals(" ")) {
                word += s.substring(i,i+1);
            }
        }
        double sqrt = Math.sqrt(word.length());
        int sqrt1 = (int) sqrt;
        int sqrt2 = 0;
        if(sqrt1 * sqrt1 == word.length()) {
            sqrt2 = sqrt1;
        } else {
            sqrt2 = sqrt1 + 1;
        }
        if(sqrt1 * sqrt2 < word.length()) {
            sqrt1 = sqrt1 + 1;
        }
        System.out.println(sqrt1);
        
        String result = "";
        for(int i = 0  ; i < sqrt2 ; i++) {
            for(int j = 0 ; j < sqrt1 ; j++) {
                int t = i + ((j * sqrt2));
                if(t > word.length() -1) {
                    break;
                }
                result += word.charAt(t);
            }
            result += " ";
        }
        return result;
    } 
}
