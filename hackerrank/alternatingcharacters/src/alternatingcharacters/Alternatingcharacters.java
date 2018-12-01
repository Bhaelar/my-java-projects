/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alternatingcharacters;

/**
 *
 * @author Modupe Okenla
 */
public class Alternatingcharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = alternatingCharacters("aaaabbbcddaa");
        System.out.println(a);
    }
    static int alternatingCharacters(String s) {
        int count = 0;
        String s2 = "";
        s2 = s;
       
        for(int i = 1 ; i < s2.length() ; i++) {
            //System.out.println(s2);
            if(s2.substring(i,i+1).equals(s2.substring(i - 1,i))) {
                //s2 = s2.substring(i-1,i) + s2.substring(i,s2.length());
                ++count;
                //i = 1;
            }
        }
        return count;
    }
}
