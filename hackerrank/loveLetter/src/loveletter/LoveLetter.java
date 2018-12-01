/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loveletter;

/**
 *
 * @author Modupe Okenla
 */
public class LoveLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = theLoveLetterMystery("abcba");
        System.out.println(a);
    }
    static int theLoveLetterMystery(String s) {
        int count = 0;
        // use two pointers;
        int i = 0, j = s.length() - 1;
        while(i < j){
            count += Math.abs(s.charAt(i) - s.charAt(j));
            i++; j--;
        }
        return count;
    }
}
