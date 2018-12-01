/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicerolling;
import java.util.Scanner;
import java.security.SecureRandom;

/**
 *
 * @author Modupe Okenla
 */
public class DiceRolling {
public static int n1,n2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of times");
        int times = input.nextInt();
        int [] frequency = new int[13];
        
        rollDice(times,frequency);
        displayFrequency(frequency);
    }
    public static void rollDice(int times,int[] frequency) {
        SecureRandom rand = new SecureRandom();
        
        for(int i = 0; i < times; i++) {
            n1 = 1 + rand.nextInt(6);
            n2 = 1 + rand.nextInt(6);
            int sum = n1 + n2;
            frequency[sum]++;
        }
        
    }
    public static void displayFrequency(int[] frequency) {
        System.out.printf("%s%10s\n", "sum","frequency");
        for (int i = 2; i < frequency.length ; i++) {
            System.out.printf("%3d%10d\n",i,frequency[i]);
        }
    }
}
