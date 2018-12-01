/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printererrors;

/**
 *
 * @author Modupe Okenla
 */
public class PrinterErrors {

    /**
     * @param args the command line arguments
     */
    
    public static String printerError(String s) {
        // your code
        char[] alphabets = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
          char c = s.charAt(i);
          
             
            if(c != alphabets[0] && c != alphabets[1] &&  c != alphabets[2] && c != alphabets[3] && c != alphabets[4] && c != alphabets[5] && c != alphabets[6] && c != alphabets[7] && c != alphabets[8] && c != alphabets[9] && c != alphabets[10] && c != alphabets[11] && c != alphabets[12]) {
              ++count;
            
          }
        }
        String l = Integer.toString(count) + "/" + Integer.toString(s.length());
        return l;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(printerError("aavahdgydhhjnx"));
    }
    
}
