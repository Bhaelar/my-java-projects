package gameofthronesi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;


/**
 *
 * @author Modupe Okenla
 */
public class GameOfThronesI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(gameOfThrones("aaaaabbb"));
    }
    static String gameOfThrones(String s) {
        int noChar = 256;
        int count[] = new int[noChar];
        Arrays.fill(count,0);
        for(int i = 0 ; i < s.length() ; i++) {
            count[(int) s.charAt(i)]++;
        }
        
        int odd = 0;
        
        for(int i = 0 ; i < noChar ; i++) {
            if((count[i] & 1) == 1) {
                odd++;
            }
            if (odd > 1) {
                return "NO";
            }
        }
        return "YES";
    }
}
