/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayoftheprogrammer;

/**
 *
 * @author Modupe Okenla
 */
public class DayOfTheProgrammer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(solve(2100));
    }
    static String solve(int year) {
        String date = "";
        if(year % 4 == 0) {
            date += "12.09." + year;
        }
        else if(year == 1918) {
            date += "26.09." + year;
        }
        else {
            date += "13.09." + year;
        }
        return date;
    }
}
