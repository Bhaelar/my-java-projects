/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautifuldays;

/**
 *
 * @author Modupe Okenla
 */
public class BeautifuldAys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = beautifulDays(20,23,6);
        System.out.println(a);
    }
    static int beautifulDays(int i, int j, int k) {
        int days = 0;
        for(int a = i ; a <= j ; a++) {
            String b = "" + a;
            String c= "";
            String[] tokens = b.split("");
            for(int x = b.length() - 1 ; x >= 0 ; x--) {
                c += tokens[x];
            }
            int d = Integer.parseInt(c);
            if((a-d) % k == 0) {
                ++days;
            }
        }
        return days;
    }
}
