/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;
import java.util.ArrayList;
/**
 *
 * @author Modupe Okenla
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,result,str1,highest = 0;
        String str = "";
        ArrayList<Integer> palindrome = new ArrayList<Integer>();
        for(i = 100 ; i < 1000 ; i ++) {
            for(j = 100 ; j < 1000 ; j++) {
                result = i * j;
                if (result > 600000) {
                    str = Integer.toString(result);
                }
                if (str.length() == 6) {
                    if ((str.charAt(0)==str.charAt(str.length()-1))&&(str.charAt(1)==str.charAt(str.length()-2))&&(str.charAt(2)==str.charAt(str.length()-3))) {
                        str1 = Integer.parseInt(str);
                        palindrome.add(str1);
                    }
                }
            }
        }
        System.out.println(palindrome);
        
        for(int y = 0 ; y < palindrome.size() ; y++) {
            highest = palindrome.get(0);
            if (palindrome.get(y) > highest) {
                highest = palindrome.get(y);
            }
        }
        System.out.println(highest);
    }
    
}
