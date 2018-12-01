/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangecounter;

/**
 *
 * @author Modupe Okenla
 */
public class Strangecounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(strangeCounter(4));
    }
    static long strangeCounter(long t) {
        long time = 0;
        long value = 3;
        long ans = 0;
        int i = 1;
        long b = value + 1;
        while(i <= t) {
            time++;
            System.out.println("time: " + time );
             b--;
            System.out.println("b: " + b);
            if(time == t) {
                ans = b;
                break;
            }
            i++;
            if(b == 1) {
                value *= 2;
                b = value + 1;
            }
        }
        return ans;
    }
}
