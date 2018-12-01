/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_conversion;

/**
 *
 * @author Modupe Okenla
 */
public class Time_conversion {

    /**
     * @param args the command line arguments
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String [] tokens = s.split(":");
        if(tokens[2].substring(2).equals("PM")) {
            int hour = 0;
            if(!tokens[0].equals("12")) {
                hour = Integer.parseInt(tokens[0]) + 12;
            
                tokens[0] = Integer.toString(hour);
            }
        }
        if(tokens[2].substring(2).equals("AM")) {
            int hour = 0;
            if(tokens[0].equals("12")) {
                tokens[0] = "00";
            }
        }
        String time = tokens[0] + ":" + tokens[1] + ":" + tokens[2].substring(0,2);
        return time;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
