/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jewelsandstones;

/**
 *
 * @author Modupe Okenla
 */
public class JewelsAndStones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(numJewelsInStones("aA","aAAAAbcd"));
    }
    public static int numJewelsInStones(String J, String S) {
        String[] tokens1 = J.split("");
        String[] tokens2 = S.split("");
        int count = 0;
        for(int i = 0 ; i < S.length() ; i++) {
            for(int j = 0 ; j < tokens1.length ; j++) {
               if(tokens2[i].equals(tokens1[j])) {
                   ++count;
               }
            }
        }
        return count;
    }
}
