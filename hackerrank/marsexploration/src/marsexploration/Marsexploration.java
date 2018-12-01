/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsexploration;

/**
 *
 * @author Modupe Okenla
 */
public class Marsexploration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }
    static int marsExploration(String s) {
        int msg = s.length() / 3;
        String[] sos = "SOS".split("");
        int noS = msg * 2;
        int count = 0;
        for(int i = 0 ; i < msg ; i++) {
            for(int j = 1 ; j <= 3 ; j++) {
                int k = (i * 3) + j - 1;
                if(!s.substring(k,k+1).equals(sos[j - 1])) {
                    ++count;
                }
            }
        }
        return count;
    }
}
