/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangram;

/**
 *
 * @author Modupe Okenla
 */
public class Pangram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(pangrams("we promptly judged antique ivory buckles for the prize"));
    }
    static String pangrams(String s) {
        String[] letters = "abcdefghijklmnopqrstuvwxyz".split("");
        String found = "";
        String s1 = s.toLowerCase();
        int count = 0;
        for(int i = 0 ; i < s1.length() ; i++) {
            Boolean check = true;
            for(int k = 0 ; k < found.length() ; k++) {
                    if(s1.substring(i,i+1).equals(found.substring(k,k+1))) {
                        check = false;
                        break;
                    }
            }
            if(check == true) {
            for(int j = 0 ; j < letters.length ; j++) {
                if(s1.substring(i,i+1).equals(letters[j])) {
                    count++;
                    found += s1.substring(i,i+1);
                }
            }}
        }
        if (count == 26) {
            return "PANGRAM".toLowerCase();
        } else {
            return "NOT PANGRAM".toLowerCase();
        }
    }
}
