/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetspeak;

/**
 *
 * @author Modupe Okenla
 */
public class LeetSpeak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(toLeetSpeak("LEET"));
    }
    static String toLeetSpeak(final String speak) {
        String [] key = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String [] value = {"@","8","(","D","3","F","6","#","!","J","K","1","M","N","0","P","Q","R","$","7","U","V","W","X","Y","2"};
        String ans = "";
        for(int i = 0 ; i < speak.length(); i++) {
            for(int j = 0 ;j < key.length ; j++) {
                if(speak.substring(i,i+1).equals(key[j])) {
                    ans += value[j];
                    break;
                }
            }
        }
        
        return ans;
    }
}
