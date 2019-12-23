/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesreservation;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author Modupe Okenla
 */
public class AirlinesReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boolean[] array = {false, false, false, false, false, false, false, false, false, false};
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        SecureRandom rand = new SecureRandom();
        System.out.println("Please type 1 for first class or type 2 for economy");
        int choice = input.nextInt();
        if(choice == 1) {
            a = rand.nextInt(5);
            if(array[a] != true) {
                array[a] = true;
                System.out.println("You have been assigned seat no. " + (a + 1) + " in the first class section");
            }
        }
        if(choice == 2) {
            b = rand.nextInt(5);
            if(array[b] != true) {
                array[b] = true;
                System.out.println("You have been assigned seat no. " + (a + 1) + " in the first class section");
            }
        }
        
    }
    
}
