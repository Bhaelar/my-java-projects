/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting.valleys;

/**
 *
 * @author Modupe Okenla
 */
public class CountingValleys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(countingValleys(12,"DDUUDDUDUUUD"));
    }
    static int countingValleys(int n, String s) {
        int answer = 0;
        int i = 0;
        for(char c : s.toCharArray()){
            if(c == 'U') { 
                ++i;
            }
            if(c == 'D') {
                --i;
            }
            
            // if we just came UP to sea level
            if(i == 0 && c == 'U')
                ++answer;
        }
        return answer;
    }
}
