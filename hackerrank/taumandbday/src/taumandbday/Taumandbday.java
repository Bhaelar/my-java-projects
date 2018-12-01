/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taumandbday;

/**
 *
 * @author Modupe Okenla
 */
public class Taumandbday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(taumBday(27984, 1402, 619246, 615589, 247954));
    }
    static long taumBday(int b, int w, int bc, int wc, int z) {
        int x = bc;
        int y = wc;
        x = x>y? ((x-y>z)? y+z : x) : x;

        y = y>x? ((y-x>z)? x+z : y) : y;
        
        return b*x+w*y;
    }
}
