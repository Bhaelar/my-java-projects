/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isogram;

/**
 *
 * @author Modupe Okenla
 */
public class Isogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isIsogram("thumbscrewjapingly"));
    }
    public static boolean  isIsogram(String str) {
        // ...
        str.toLowerCase();
        String [] tokens = str.split("");
        int count = 0;
        for(int i = 0 ; i < tokens.length ; i++) {
            
            for(int j = 0 ; j < tokens.length ; j++) {
                if(tokens[i].equals(tokens[j])) {
                    ++count;
                }
            }
        }
        if(count == tokens.length) {
            return true;
        }
        else {
            return false;
        }
    } 
}
