/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofthrones;

/**
 *
 * @author Modupe Okenla
 */
public class Gameofthrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(check("cdcdcdcdeeeef"));
    }
    static String check(String s) {
        String s1 = "";
        String s2 = "";
        for(int i = 0 ; i < s.length() ; i++) {
            int count = 0;
            for(int j = i + 1 ; j < s.length() ; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                    s1 = s.substring(i,i + 1) + s1 + s.substring(j,j + 1);
                    System.out.println(s1);
                    s = s.substring(0,i) + s.substring(i + 1,j) + s.substring(j+1,s.length());
                    System.out.println(s);
                    System.out.println("0: " + s.charAt(0) + " 1: " + s.charAt(1));
                    break; 
                }
            }
            if(count > 0) {
                System.out.println("count: " + count);
                i = 0;
            }
        }
        int a = s1.length() / 2;
        s2 = s1.substring(0,a) + s + s1.substring(a,s1.length());
        //System.out.println(s1);
        //System.out.println(s2);
        for(int i = 0 ; i < s2.length() / 2 ; i++) {
            if(s2.charAt(i) != s2.charAt(s2.length() - i - 1)) {
                return "NO";
            }
        }   
        return "YES";
    }
}
