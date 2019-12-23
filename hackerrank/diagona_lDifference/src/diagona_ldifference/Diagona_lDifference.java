/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagona_ldifference;

/**
 *
 * @author Modupe Okenla
 */
public class Diagona_lDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] arr = {{11,2,4},{4,5,6},{10,8,-12}};
        diagonalDifference(arr);
    }
    static int diagonalDifference(int[][] arr) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length ; i++) {
            a += arr[i][i];
        }
        int j = 0;
        for(int i = arr.length - 1 ; i > -1 ; i--) {
            
            b += arr[i][j];
            j++;
        }
        System.out.println(a + " " + b);
        int ans= Math.abs(a-b);
        return ans;
    }
}
