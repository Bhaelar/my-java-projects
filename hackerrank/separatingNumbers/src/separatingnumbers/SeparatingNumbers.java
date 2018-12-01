/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separatingnumbers;

/**
 *
 * @author Modupe Okenla
 */
public class SeparatingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        separateNumbers("9101113");
    }
    static void separateNumbers(String s) {
        boolean check = false;
        long first = 0;
        for(int i= 1 ; i <= s.length()/2 ; i++) {
            long x = Long.parseLong(s.substring(0,i));
            //System.out.println("x: " + x);
            first = x;
            String test = Long.toString(x);
            while(test.length() < s.length()) {
                test += Long.toString(++x);
                //System.out.println("test: " + test);
            }
            if(test.equals(s)) {
                check = true;
                break;
            }
        }
        System.out.println(check ? "YES " + first : "NO");
    }
}
