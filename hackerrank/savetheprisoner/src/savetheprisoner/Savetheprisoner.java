/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheprisoner;

/**
 *
 * @author Modupe Okenla
 */
public class Savetheprisoner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(saveThePrisoner(4,6,2));
    }
    static int saveThePrisoner(int n, int m, int s) {
        int warn = 0;
        
        for(int i = 0 ;i < m ; i++) {
            s++;
            if(s > n) {
                s = 1;
            }
            
        }
        return s-1;
    }
}
