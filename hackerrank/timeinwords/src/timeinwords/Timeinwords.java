/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeinwords;

/**
 *
 * @author Modupe Okenla
 */
public class Timeinwords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = timeInWords(1,1);
        System.out.println(s);
    }
    static String timeInWords(int h, int m) {
        String[] hours = "one two three four five six seven eight nine ten eleven twelve".split(" ");
        String[] minutes = {"one", "two", "three", "four" ,"five", "six", "seven" ,"eight", "nine" ,"ten" ,"eleven" ,"twelve" ,"thirteen" ,"fourteen" ,"fifteen", "sixteen" ,"seventeen" ,"eighteen" ,"nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty"};
        int rem = 60 - m;
        String ans = "";
        if(rem == 60) {
            ans += hours[h-1] + " o' clock";
        } else if(rem == 15) {
            if(h > hours.length - 1){
                h = h - 12;
                ans += "quarter to " + hours[h];
            }
            else {
                ans += "quarter to " + hours[h];
            }
        } else if(rem == 30) {
            ans += "half past " + hours[h-1];
        } else if (rem == 45) {
            ans += "quarter past " + hours[h - 1];
        } else if (rem > 30) {
            if(m == 1) {
                ans += minutes[m-1] + " minute past " + hours[h-1];
            }
            else {ans += minutes[m-1] + " minutes past " + hours[h-1];}
        } else if (rem < 30) {
            ans += minutes[rem-1] + " minutes to " + hours[h];
        }
        
        return ans;
    }
}
