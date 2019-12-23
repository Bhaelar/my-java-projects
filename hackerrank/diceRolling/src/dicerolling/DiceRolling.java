/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicerolling;

import java.security.SecureRandom;

/**
 *
 * @author Modupe Okenla
 */
public class DiceRolling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*(Dice Rolling) Write an application to simulate the rolling of two dice. The application
        should use an object of class Random once to roll the first die and again to roll the second die. The
        sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
        the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
        least frequent. Figure 6.21 shows the 36 possible combinations of the two dice. Your application
        should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
        each possible sum appears. Display the results in tabular format.*/
        
        SecureRandom rand = new SecureRandom();
        int[] array = {0,0,0,0,0,0,0,0,0,0,0};
        int a = 0;
        int b = 0;
        for(int i = 0 ;i < 36000000; i++) {
            a = rand.nextInt(6) + 1;
            b = rand.nextInt(6) + 1;
            int answer = a + b;
            if(answer == 2) {
                array[0]++;
            }else if(answer == 3) {
                array[1]++;
            }else if(answer == 4) {
                array[2]++;
            }else if(answer == 5) {
                array[3]++;
            }else if(answer == 6) {
                array[4]++;
            }else if(answer == 7) {
                array[5]++;
            }else if(answer == 8) {
                array[6]++;
            }else if(answer == 9) {
                array[7]++;
            }else if(answer == 10) {
                array[8]++;
            }else if(answer == 11) {
                array[9]++;
            }else {
                array[10]++;
            }
        }
        
        System.out.println("Number \t No of Occurence");
        for(int i = 1; i <= array.length ; i++) {
            System.out.println((i+1) + " \t " + array[i-1]);
        }
    }
    
}
