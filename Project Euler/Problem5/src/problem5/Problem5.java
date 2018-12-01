/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> l = new ArrayList<Integer>();
        int i = 1;
        while(i > 0){
            if (i%1==0 && i%2==0 && i%3==0 && i%4==0 && i%5==0 && i%6==0 && i%7==0 && i%8==0 && i%9==0 && i%10==0 && i%11==0 && i%12==0 && i%13==0 && i%14==0 && i%15==0 && i%16==0 && i%17==0 && i%18==0 && i%19==0 && i%20==0) {
                System.out.println(i);
                break;
            }
            i++;
        }
        
    }
    
}
