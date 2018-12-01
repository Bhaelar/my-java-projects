/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaprekarnumbers;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class Kaprekarnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kaprekarNumbers(1,999);
        
    }
    static void kaprekarNumbers(int p, int q) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        if(p == 1) {
            System.out.print(p + " ");
            list.add(p);
        }
        for(int i = p ; i <= q ; i++) {
            int square = i * i;
            String s1 = Integer.toString(i);
            String s = Integer.toString(square);
            
                String part1 = "";
                String part2 = "";
                if(s.length() > 1) {
                    for(int j = s.length() - s1.length() ; j < s.length() ; j++) {
                        part2 += s.substring(j,j+1);
                    }
                    //System.out.println(part2);
                    for(int j = 0 ; j < s.length() - part2.length() ; j++) {
                        part1 += s.substring(j,j+1);
                    }
                    //System.out.println(part1);
                    int part11 = Integer.parseInt(part1);
                    int part22 = Integer.parseInt(part2);
                    if(part11 + part22 == i) {
                        list.add(i);
                        System.out.print(i + " ");
                    }
                }
        }
        if(list.size() < 1) {
            System.out.print("INVALID RANGE");
        }
    }
}
