/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morsecode;

/**
 *
 * @author Modupe Okenla
 */
public class MorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String [] newWord = new String [words.length];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < words.length ; i++) {
            for(int j = 0 ; j < words[i].length() ; j++) {
                char c = words[i].charAt(j);
                for(int k = 0 ; k < alpha.length() ; k++) {
                    char d = alpha.charAt(k);
                    if(c == d) {
                        newWord[i] += morse[k];
                    }
                    
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i < newWord.length ; i++) {
            for(int j = i + 1 ; j < newWord.length ; j++) {
                if(newWord[i].equals(newWord[j])) {
                    ++count;
                }
            }
        }
        return count;
    }
}
