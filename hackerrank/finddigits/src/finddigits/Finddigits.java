/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finddigits;

/**
 *
 * @author Modupe Okenla
 */
public class Finddigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(findDigits(1012));
    }
    static int findDigits(int n) {
        String num = Integer.toString(n);
        int count = 0;
        for(int i = 0 ; i < num.length() ; i++) {
            int x = Integer.parseInt(num.substring(i,i+1));
            if(x == 0) {
                continue;
            }
            if(n % x == 0) {
                ++count;
            }
        }
        return count;
    }
}
