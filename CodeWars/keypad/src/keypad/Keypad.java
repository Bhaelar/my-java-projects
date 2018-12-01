/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keypad;

/**
 *
 * @author Modupe Okenla
 */
public class Keypad {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int answer = presses("LAqCMC'dxieZ*IWbOr");
        System.out.println(answer);
    }
    public static int presses(String phrase) {
        String result = phrase.toLowerCase();
        String letters1 = "abc2";
        String letters2 = "def3";
        String letters3 = "ghi4";
        String letters4 = "jkl5";
        String letters5 = "mno6";
        String letters6 = "pqrs7";
        String letters7 = "tuv8";
        String letters8 = "wxyz9";
        
        int total = 0;
        for (int i = 0 ; i < phrase.length() ; i++) {
            char c = result.charAt(i);
            for (int l1 = 0 ; l1 < letters1.length() ; l1++) {
                char d1 = letters1.charAt(l1);
                if(c==d1) {
                    total += (l1 + 1);
                }
            }
            for (int l2 = 0 ; l2 < letters2.length() ; l2++) {
                char d2 = letters2.charAt(l2);
                if(c==d2) {
                    total += (l2 + 1);
                }
            }
            for (int l3 = 0 ; l3 < letters3.length() ; l3++) {
                char d3 = letters3.charAt(l3);
                if(c==d3) {
                    total += (l3 + 1);
                }
            }
            for (int l4 = 0 ; l4 < letters4.length() ; l4++) {
                char d4 = letters4.charAt(l4);
                if(c==d4) {
                    total += l4 + 1;
                }
            }
            for (int l5 = 0 ; l5 < letters5.length() ; l5++) {
                char d5 = letters5.charAt(l5);
                if(c==d5) {
                    total += l5 + 1;
                }
            }
            for (int l6 = 0 ; l6 < letters6.length() ; l6++) {
                char d6 = letters6.charAt(l6);
                if(c==d6) {
                    total += l6 + 1;
                }
            }
            for (int l7 = 0 ; l7 < letters7.length() ; l7++) {
                char d7 = letters7.charAt(l7);
                if(c==d7) {
                    total += l7 + 1;
                }
            }
            for (int l8 = 0 ; l8 < letters8.length() ; l8++) {
                char d8 = letters8.charAt(l8);
                if(c==d8) {
                    total += l8 + 1;
                }
            }
            if (c == ' ') {
                total += 1;
            }
            
            if(c == '1' || c == '*' || c=='#') {
               total++;
            }
            if(c == '0') {
              total += 2;
            }
        }
        return total;
    }
    
}