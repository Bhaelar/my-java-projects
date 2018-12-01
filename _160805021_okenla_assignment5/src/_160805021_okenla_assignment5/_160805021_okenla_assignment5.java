/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _160805021_okenla_assignment5;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class _160805021_okenla_assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Solving linear equations");
        System.out.println();
        double[][] question = {{1,2,1,4,13},{2,0,4,3,28},{4,2,2,1,20},{-3,1,3,2,6}};
        double[] arr = {question[1][0],question[2][0],question[3][0]};
        //R1 is used to eliminate rows below it
        for(int i = 1 ; i < question.length ; i++) {
            for(int j = 0 ; j < question[i].length ; j++) {
                question[i][j] -= ((arr[i - 1]/question[0][0]) * question[0][j]);
            }
        }
        
        //R2 s used to eliminate rows below it
        
        double [] arr1 = {question[2][1],question[3][1]};
        for(int i = 2 ; i < question.length ; i++) {
            for(int j = 0 ; j < question[i].length ; j++) {
                question[i][j] -= ((arr1[i - 2]/question[1][1]) * question[1][j]);
            }
        }

        //R3 is used to eliminate rows below it
        
        double [] arr3 = {question[3][2]};
        for(int i = 3 ; i < question.length ; i++) {
            for(int j = 0 ; j < question[i].length ; j++) {
                
                question[i][j] -= ((arr3[i - 3]/question[2][2]) * question[2][j]);
            }
        }
        System.out.println(Arrays.deepToString(question));
        System.out.println();
        double a,b,c,d;
        d =  (question[3][4] / question[3][3]);
        c = (question[2][4] - question[2][3]*d) / question[2][2];
        b = (question[1][4] - (question[1][3] * d) - (question[1][2] * c)) / question[1][1];
        a = (question[0][4] - (question[0][3] * d) - (question[0][2] * c) - (question[0][1] * b)) / question[0][0];
 
        System.out.printf("Roots of the linear equation are : %.2f , %.2f , %.2f , %.2f\n",a,b,c,d );
    }
    
}
