/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem9;

/**
 *
 * @author Modupe Okenla
 */
public class Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1 ; i < 1000 ; i++) {
            for (int j = 1 ; j < 1000 ; j++) {
                for (int k = 1 ; k < 1000 ; k++) {
                    if (i < j) {
                        if (j < k){
                            if ((i * i) + (j * j) == (k * k)) {
                                if (i + j + k == 1000) {
                                    System.out.println(i * j * k);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
}
