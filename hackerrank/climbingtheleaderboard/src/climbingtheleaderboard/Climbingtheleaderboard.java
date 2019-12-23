/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climbingtheleaderboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Climbingtheleaderboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] scores = {100 ,100 ,50 ,40 ,40 ,20 ,10};
        int[] alice = {5,25,50,120};
        System.out.println(Arrays.toString(climbingLeaderboard(scores,alice)));
    }
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int [] answers = new int [alice.length];
        ArrayList<Integer> score = new ArrayList<>();
        for(int i = 0 ; i < scores.length ; i++) {
            score.add(scores[i]);
        }
        for(int i = 0 ; i < alice.length ; i++) {
            score.add(alice[i]);
            Collections.sort(score,Collections.reverseOrder());
            //System.out.println(score);
            int [] temp = new int [score.size()];
            temp[0] = 1;
            for(int j = 1 ; j < score.size() ; j++) {
                
                if(score.get(j) == score.get(j-1)) {
                    temp[j] = temp[j -1];
                    //System.out.println("j: " + score.get(j));
                } else {
                    temp[j] = temp[j - 1] + 1;
                    //System.out.println("j: " + score.get(j));
                }
            }
            //System.out.println(Arrays.toString(temp));
            for(int k = 0 ; k < score.size() ; k++) {
                if(score.get(k) == alice[i]) {
                    answers[i] = temp[k];
                }
            }
        }
        return answers;
    }
}
