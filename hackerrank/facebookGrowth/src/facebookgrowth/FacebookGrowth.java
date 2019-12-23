/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookgrowth;

/**
 *
 * @author Modupe Okenla
 */
public class FacebookGrowth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double principal = 1000000000;
        double amount = 0;
        int month = 1;
        double rate = 0.04;
        while (amount < 2000000000)
        {
            // calculate new amount for specified year
            amount = principal * Math.pow(1.0 + rate, month);
            // display the year and the amount
            // System.out.printf("%4d%,20.2f%n", year, amount);
            month++;
        }
        System.out.println("It will take Facebook " + month + " months to reach 2B users");
    }
    
}
