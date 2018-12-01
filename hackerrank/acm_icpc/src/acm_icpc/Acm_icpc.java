/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_icpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Acm_icpc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] topic = {"10101","11100","11010","00101"};
        System.out.println(Arrays.toString(acmTeam(topic)));
    }
    static int[] acmTeam(String[] topic) {
        ArrayList<Integer> count = new ArrayList<Integer>();
        for(int i = 0 ; i < topic.length ; i++) {
            
            for(int j = i + 1 ; j < topic.length ; j++) {
                int answer = 0;
                for(int k = 0 ; k < topic[i].length() ; k++) {
                    if("1".equals(topic[i].substring(k,k+1)) || "1".equals(topic[j].substring(k,k+1))) {
                        answer++;
                    } 
                }
                count.add(answer);
            }
        }
        Collections.sort(count);
        int[] answer = new int[2];
        answer[0] = count.get(count.size() - 1);
        int a = 0;
        for(int i = 0 ; i < count.size() ; i++) {
            if(count.get(i) == answer[0]) {
                a++;
            }
        }
        answer[1] = a;
        return answer;
    }
}
