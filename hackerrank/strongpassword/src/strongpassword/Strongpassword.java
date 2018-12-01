/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strongpassword;

/**
 *
 * @author Modupe Okenla
 */
public class Strongpassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = minimumNumber(3,"0H2");
        System.out.println(a);
    }
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String[] numbers = "0123456789".split("");
        String[] lower_case = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        String[] special_characters = "!@#$%^&*()-+".split("");
        int passed = 0;
        Boolean number = false;
        Boolean lower = false;
        Boolean upper = false;
        Boolean special = false;
        if(n >= 6) {
            ++passed;
        }
        
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < numbers.length ; j++) {
                if(password.substring(i,i+1).equals(numbers[j])) {
                    if(number == false) {
                        passed++;
                        number = true;
                        break;
                    }
                }
            }
            for(int j = 0 ; j < lower_case.length ; j++) {
                if(password.substring(i,i+1).equals(lower_case[j])) {
                    if(lower == false) {
                        passed++;
                        lower = true;
                        break;
                    }
                }
            }
            for(int j = 0 ; j < upper_case.length ; j++) {
                if(password.substring(i,i+1).equals(upper_case[j])) {
                    if(upper == false) {
                        passed++;
                        upper = true;
                        break;
                    }
                }
            }
            for(int j = 0 ; j < special_characters.length ; j++) {
                if(password.substring(i,i+1).equals(special_characters[j])) {
                    if(special == false) {
                        passed++;
                        special = true;
                        break;
                    }
                }
            }
        }
        if(n >= 6) {
            return 5 - passed;
        }
        else if(n > 2 && n < 6) {
            int a = 5 - passed;
            if(a + n <= 6) {
                return a + (6 - (a + n));
            }
            return a - 1;
        }
        else{
            int a = 5 - passed;
            return a + (6 - n - a);
        }
     }
}
