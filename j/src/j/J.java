/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j;

/**
 *
 * @author Modupe Okenla
 */
public class J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 2;
        boolean check = true;
        
        int ans = 0;
        while(i > 0) {
            int count = 0;
            for(int j = 2 ; j <= 10 ; j++) {
              if(i % j == 0) {
                ++count;
              }
            }
            if(count == 9) {
              ans = i;
              break;
            }
            i++;
        }
          System.out.println(ans);
    }
    
}
