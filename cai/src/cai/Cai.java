/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cai;
import java.util.Scanner;
import java.security.SecureRandom;

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
        
        question();
    }
    public static void question() {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int a = 1 + random.nextInt(9);
        int b = 1 + random.nextInt(9);
        System.out.println("How much is " + a + " * " + b);
        int answer = input.nextInt();
        if(answer == a*b) {
            System.out.println("Very good!");
            
        }
        else {
            System.out.println("Wrong..Try again");
        }
        System.out.println("Type T to take test, Type Z to exit");
        String s = input.nextLine();
        if(s=="t")
            question();
        if(s=="z")
            System.out.println("bye");
    }
}
