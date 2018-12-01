/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superreducedstring;

/**
 *
 * @author Modupe Okenla
 */
public class Superreducedstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(superReducedString("amazing"));
    }
    static String superReducedString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                s = s.substring(0, i-1) + s.substring(i+1);
                i = 0;
            }
        }
        if (s.length() == 0) {
            return "Empty String";
        } else {
            return s;
        }
    }
}
