/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroo;

/**
 *
 * @author Modupe Okenla
 */
public class Kangaroo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(kangaroo(28,8,96,2));
    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer = "NO";
        int move1 = x1;
        int move2 = x2;
        
            
            for(int i = 1 ; i < 999 ; i++) {
                move1 += v1;
                move2 += v2;
                if(move1 == move2) {
                    answer = "YES";
                    System.out.println(i);
                    break;
                }
            }
        
        return answer;
    }
}
