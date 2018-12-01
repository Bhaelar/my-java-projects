/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationandcombination;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class PermutationAndCombination {

    
    /**
     * @param args the command line arguments
     */
    public static int fact(int number) {
        int fact = 1;
        for (int i=1;i<=number;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Permutation and Combination calculator");
        System.out.println("Enter n:");
        int n = input.nextInt();
        System.out.println("Enter r: ");
        int r = input.nextInt();
        double perm = fact(n) / fact(n-r);
        double combo = fact(n) / (fact(n-r) * fact(r));
        System.out.println("Permutation: " + perm);
        System.out.println("Combination: " + combo);
        
    }
    
}
