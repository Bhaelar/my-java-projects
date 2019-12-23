/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cai;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author Modupe Okenla
 */
public class Cai {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Assisted Learning");
        System.out.print("To begin, press 1: ");
        int beg = input.nextInt();
        while( beg != 1 ) {
            System.out.println("You have inputted a wrong option");
            System.out.println("To begin, press 1: ");
            beg = input.nextInt();
        } 
        int exit = 0;
        int ans = 0;
        String[] array1 = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
        String[] array2 = {"No. Please try again.", "Wrong. Try once more", "Don't give up", "No. Keep trying."};
        while(exit < 5) {
            SecureRandom rand = new SecureRandom();
            int a = rand.nextInt(10);
            int b = rand.nextInt(10);
            int c = rand.nextInt(4);
            int d = rand.nextInt(4);
            newQ(a,b);
            while(ans != newQ(a,b)) {
                ans = input.nextInt();
                System.out.println(array2[d]);
            }
            System.out.println(array1[c]);
            exit++;
        }
    }
    public static int newQ(int a,int b) {
        String question = "How much is " + a + " times " + b;
        System.out.println(question);
        int answer = a * b;
        return answer;
    }
    
}
