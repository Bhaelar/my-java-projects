/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatedstring;

/**
 *
 * @author Modupe Okenla
 */
public class Repeatedstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(repeatedString("abcde",1000000000));
    }
    static long repeatedString(String s , long n) {
        String a = "";
        long ans = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.substring(i,i+1).equals("a")){
                ++ans;
            }
        }
        long factor = n / s.length();
        ans *= factor;
        long rem = n % s.length();
        for(int i = 0 ; i < rem ; i++) {
            if(s.substring(i,i+1).equals("a")){
                ++ans;
            }
        }
        return ans;
    }
}
