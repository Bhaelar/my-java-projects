/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecutivestrings;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class ConsecutiveStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] array = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k = 2;
        System.out.println(longestConsec(array,k));
    }
    public static String longestConsec(String[] strarr, int k) {
        // your code
        ArrayList<Integer> check = new ArrayList();
        String answer = "";
        for(int i = 0; i < strarr.length ; i++) {
            String word = "";
            for(int j = i; j <= i + 1; j++) {
                word += strarr[j];
            }
            check.add(word.length());
            if(check.size() > 1) {
                for(int l = 1 ; l < check.size() ; l++) {
                    if(check.get(l) > check.get(0)) {
                        answer = word;
                    }
                }
            }
        }
        return answer;
    }
}
