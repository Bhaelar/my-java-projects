/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncing;

/**
 *
 * @author Modupe Okenla
 */
public class Bouncing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(bouncingBall(3,1,1.5));
    }
    	public static int bouncingBall(double h, double bounce, double window) {
	    // your code
            int ans = -1;
            if(h > 0 && (bounce > 0 && bounce < 1) && window < h) {
                double check = 0;
                check = (bounce * h);
                
                if(Math.round(check) > window) {
                    ans = (int) (Math.round(check) + 1);
                }
                
            }
            return ans;
	}
}
