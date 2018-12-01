/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _160805021_okenla_assignment4;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class _160805021_okenla_assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat1 = {{5,2},{7,3}};
        int[][] mat2 = {{5,2},{7,3}};
        addMatrix(mat1,mat2);
        multiplyMatrix(mat1,mat2);
        int[][] mat = {{3,3,3},{3,4,6},{5,1,2}};
        determinant(mat);
    }
    public static void addMatrix(int[][] mat1 , int[][] mat2) {
        int m = mat1.length;
        int n = mat1[0].length;
        int p = mat2.length;
        int q = mat2[0].length;
        if(m != p || n != q) {
            System.out.println("Can't add the matrix");
        } else {
            int[][] result = new int [m][n];
            for(int i = 0 ; i < mat1[0].length ; i++) {
                for(int j = 0 ;j < mat1.length ; j++) {
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            System.out.println("Addition: ");
            System.out.println(Arrays.deepToString(result));
        }
    }
    public static void multiplyMatrix(int[][] mat1 , int[][] mat2) {
        int m = mat1.length;
        int n = mat1[0].length;
        int p = mat2.length;
        int q = mat2[0].length;
        if(n != p) {
            System.out.println("Cannot multiply matrix");
        } else {
            int[][] result = new int[m][q];
            for (int i = 0; i < m; i++) { // aRow
                for (int j = 0; j < q; j++) { // bColumn
                    for (int k = 0; k < n; k++) { // aColumn
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("Multiplication: ");
            System.out.println(Arrays.deepToString(result));
        }
    }
    public static void determinant(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if(m != n) {
            System.out.println("Determinant cant be calculated");
        } else {
            int determinant = 0;
            if(m == 1) {
                determinant = mat[0][0];
            }
            if(m == 2) {
                determinant = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
            }
            if(m == 3) {
                determinant = (mat[0][0] * (mat[1][1] * mat[2][2] - mat[2][1] * mat[1][2]))
                                - (mat[0][1] * (mat[1][0] * mat[2][2] - mat[2][0] * mat[1][2]))
                                + (mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]));
            }
            System.out.println("Determinant: ");
            System.out.println(determinant);
        }
    }
}
