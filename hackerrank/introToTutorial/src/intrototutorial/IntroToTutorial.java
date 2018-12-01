/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrototutorial;

/**
 *
 * @author Modupe Okenla
 */
public class IntroToTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static int introTutorial(int V, int[] arr) {
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == V) {
                ans = i;
            }
        }
        return ans;
    }
}
