/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryfine;

/**
 *
 * @author Modupe Okenla
 */
public class Libraryfine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(libraryFine(9,6,2015,6,6,2015));
    }
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if(y1 > y2) {
            fine = 10000;
            return fine;
        }
        else if(y1 < y2) {
            return fine;
        }
        else if(m1 > m2) {
            for(int i = 0 ; i < m1 - m2 ; i++) {
                fine += 500;
            }
            return fine;
        }
        else if(m1 < m2) {
            return fine;
        }
        else if(d1 > d2){
            for(int i = 0 ; i < d1 - d2 ; i++) {
                fine += 15;
            }
            return fine;
        } 
        else {
            return fine;
        }

    }
}
