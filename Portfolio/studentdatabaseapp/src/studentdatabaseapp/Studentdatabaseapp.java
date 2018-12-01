/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author Modupe Okenla
 */
public class Studentdatabaseapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students to enroll: ");
        int no = input.nextInt();
        student[] students = new student[no];
        
        for(int i = 0 ; i < no ; i++) {
            students[i] = new student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
    
}
