/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdaychocolate;

/**
 *
 * @author Modupe Okenla
 */
public class BirthdayChocolate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] s = {1,1,1,1,1,1};
        System.out.println(solve(s,3,2));
    }
    static int solve(int[] s, int d, int m) {
        int count = 0;
        
        for(int i = 0 ; i < s.length - m + 1 ; i++) {
            int check = 0;
            for(int j = i ; j < i + m ; j++) {
                check += s[j];
            }
            if(check == d) {
                ++count;
            }
            
        }
        return count;
    }
}
