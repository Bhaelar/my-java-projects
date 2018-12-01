/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Caesarcipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(caesarCipher("www.abc.xy",87));
    }
    static String caesarCipher(String s, int k) {
        String[] lower = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] upper = "abcdefghijklmnopqrstuvwxyz".toUpperCase().split("");
        String word = "";
        k = k % 26;
        for(int i = 0 ; i < s.length() ; i++) {
            if(Arrays.asList(lower).contains(s.substring(i,i+1))) {
                for(int j = 0 ; j < lower.length ; j++) {
                    if(s.substring(i,i+1).equals(lower[j])) {
                        
                        if(j + k >= lower.length) {
                            int a = j + k - lower.length;
                            word += lower[a];
                            break;
                        }
                        else {
                            word += lower[j + k];
                            break;
                        }
                    }
                }
            }
            else if(Arrays.asList(upper).contains(s.substring(i,i+1))) {
                for(int j = 0 ; j < upper.length ; j++) {
                    if(s.substring(i,i+1).equals(upper[j])) {
                        if(j + k >= upper.length) {
                            int a = j + k - upper.length;
                            word += upper[a];
                            break;
                        }
                        else {
                            word += upper[j + k];
                            break;
                        }
                    }
                }
            }
            else {
                word += s.substring(i,i+1);
            }
        }
        return word;
    }
}
