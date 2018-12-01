/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

/**
 *
 * @author Modupe Okenla
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(check("xaxbbbxx"));
    }
    public static int check(String s) {
        int len = s.length(), count = 0;
            if (len%2!=0){
                return -1;
                
            }
            String s1 = s.substring(0,len/2);
            String s2 = s.substring(len/2,len);
            char[] s1Chars = s1.toCharArray();
            for (char c : s1Chars){
                int index = s2.indexOf(c);
                if (index == -1){
                    count++;
                } else {
                    s2 = s2.substring(0,index)+s2.substring(index+1);
                }
            }
            return count;
    }
}
