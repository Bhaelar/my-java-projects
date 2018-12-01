/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;
import java.util.ArrayList;
/**
 *
 * @author Modupe Okenla
 */
public class Problem3 {
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static ArrayList<Integer> primenumbers = new ArrayList<Integer>();
    public static void getFactors(long num) {
        for (int i = 2 ; i < num ; i++) {
           if(num % i == 0) {
               numbers.add(i);
           }
               
        }
    }
    public static void checkPrime() {
        Boolean isTemp = true;
        String word ="";
        for(int j = 0 ; j < numbers.size(); j++) {
            for(int k = 2 ; k < numbers.get(j) / 2 ; k++){
                if(numbers.get(j)%k==0) {
                    isTemp = false;
                    break;
                }
            }
            if(isTemp == true) {
                primenumbers.add(numbers.get(j));
            }
        }
        System.out.println(primenumbers);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getFactors(600851475143L);
        checkPrime();
    }
    
}
