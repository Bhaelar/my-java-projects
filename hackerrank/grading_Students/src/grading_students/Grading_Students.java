/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading_students;

import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Grading_Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] grades = {89,14,58,42};
        System.out.println(Arrays.toString(gradingStudents(grades)));
    }
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] result = new int[grades.length];
        int[] multiples = {40,45,50,55,60,65,70,75,80,85,90,95,100};
        for(int i = 0 ; i < grades.length ; i++) {
            if(grades[i] < 38) {
                result[i] = grades[i];
                continue;
            }
            for(int j = 0 ; j < multiples.length ; j++) {
                if((grades[i] - multiples[j] >= -4) && (grades[i] - multiples[j] <= -1)) {
                    if(multiples[j] - grades[i] < 3) {
                        grades[i] = multiples[j];
                    }
                }
            }
            result[i] = grades[i];
        }
        return result;
    }
}
