/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetit;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Bonappetit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int total = 0;
        int[] list = new int [n];
        for(int i = 0 ; i < n ; i++) {
            int a = input.nextInt();
            list[i] = a;
        }
        int b = input.nextInt();
        for(int i = 0 ; i < list.length ; i++) {
            if(i == 1) {
                continue;
            } else {
                total += list[i];
            }
        }
        System.out.println(total);
        if((total/2) < b ) {
            System.out.println(b - total/2);
        } else {
            System.out.println("Bon Appetit");
        }
    }
    
}
