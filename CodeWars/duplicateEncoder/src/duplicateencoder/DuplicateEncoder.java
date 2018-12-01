/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateencoder;
import java.util.ArrayList;
/**
 *
 * @author Modupe Okenla
 */
public class DuplicateEncoder {
    static String encode(String word){
        String result= "";
        int count = 1;
        ArrayList<Character> wordlist = new ArrayList<Character>();
        ArrayList<Integer> countlist = new ArrayList<Integer>();
        for (int i = 0 ; i < word.length() ; i++) {
            char c = word.charAt(i);
            wordlist.add(c);
        }
        for(int j = 0 ; j < wordlist.size() ; j++) {
            count = 0;
            for (int k = 0 ; k < wordlist.size(); k++) {
                if (wordlist.get(j) == wordlist.get(k)) {
                    ++count;
                }
                
            }       
            countlist.add(count);
        }
        for (int m = 0 ; m < countlist.size() ; m++) {
            if (countlist.get(m) == 1) {
                wordlist.set(m,'(');
            }
            if (countlist.get(m) > 1) {
                wordlist.set(m,')');
            }
        }
        for (int l = 0 ; l < wordlist.size() ; l++) {
            result = result + String.valueOf(wordlist.get(l));
        }
        return result;
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(encode("(( @"));
    }
    
}
