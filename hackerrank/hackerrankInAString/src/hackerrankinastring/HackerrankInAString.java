/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankinastring;

/**
 *
 * @author Modupe Okenla
 */
public class HackerrankInAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }
    static String hackerrankInString(String s) {
        String[] arr = "hackerrank".split("");
        int a = 0;
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(arr[a].equals(s.substring(i,i+1))) {
                count++;
                a++;
                if(count == 10) {
                    break;
                }
            }
        }
        if(count == 10) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
