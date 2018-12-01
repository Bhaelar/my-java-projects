/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

/**
 *
 * @author Modupe Okenla
 */
public class Order {
    public static String order(String words) {
    // ...
    char[] clist = new char [] {'1','2','3','4','5','6','7','8','9'};
    for(int i = 0 ; i < words.length() ; i++) {
        char c = words.charAt(i);
        for(int j = 0 ; j < clist.length ; j++ ) {
            if(c == clist[j]) {
                
            }
        }
    }
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
