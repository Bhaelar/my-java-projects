/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angryprofessor;

/**
 *
 * @author Modupe Okenla
 */
public class Angryprofessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {-1, -3, 4, 2};
        System.out.println(angryProfessor(3,a));
    }
    static String angryProfessor(int k, int[] a) {
        int count = 0;
        for(int i = 0 ; i < a.length ; i++) {
            if(a[i] <= 0) {
                ++count;
            }
        }
        return count >= k ? "NO" : "YES";
    }
}
