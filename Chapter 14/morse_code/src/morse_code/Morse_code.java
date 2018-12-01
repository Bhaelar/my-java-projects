/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse_code;

/**
 *
 * @author Modupe Okenla
 */
public class Morse_code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "My name is basit";
        
        convert(text.toLowerCase());
    }
    public static void convert(String text) {
        String[] alpha = "abcdefghijklmnopqrstuvwxyz1234567890".split("");
        String [] textlist = text.split("");
        String word = "";
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
        for(int i = 0 ; i < text.length() ; i++) {
            for(int j = 0 ; j < alpha.length ; j++) {
                String l = alpha[j];
                if(textlist[i].equals(l)) {
                    word += morse[j] + " ";
                }
                
            }
            if(textlist[i].equals(" ")) {
                word += "  ";
            }
        }
        System.out.println(word);
    }
}
