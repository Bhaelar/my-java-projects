/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpingontheclouds;

/**
 *
 * @author Modupe Okenla
 */
public class Jumpingontheclouds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] c = {0,0,0,1,0,0};
        System.out.println(jumpingOnClouds(c));
    }
    static int jumpingOnClouds(int[] c) {
        int jump = 0;
        int i = c.length;
        int j = 0;
        while (j < i - 1 ) {
            if(j + 2 < i - 1) {
                if(c[j + 1] == 0 && c[j + 2] == 0) {
                    jump++;
                    j += 2;

                }
            }
            if(c[j + 1] == 0) {
                jump++;
                j++;
            }
            if(j + 2 < i - 1) {
                if(c[j + 1] == 1 && c[j + 2] == 0) {
                    jump++;
                    j += 2;
                }
            }
        }
        
        return jump;
    }
}
