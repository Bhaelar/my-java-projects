package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author Modupe Okenla
 */
public class student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int cost = 600;
    private static int id = 1000;
    
    //Constructor
    public student() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        
        System.out.print("Enter class level(1-5): ");
        this.year = in.nextInt();
        
        setStudentId();
        
    
    }      
    //Generate ID
    private void setStudentId() {
        id++;
        this.studentID = year+""+id;
    }
    //Enroll courses
    public void enroll() {
        Scanner input = new Scanner(System.in);
        String course = "";
        while(!course.equals("Q")) {
            System.out.print("Enter courses(Q to quit): ");
            course = input.nextLine();
            this.courses += "\n   " + course;
            this.tuitionBalance += cost;
        }
    }
    //View balance
    public void viewBalance() {
        System.out.println("Your balance is $" + tuitionBalance);
    }
    //Pay tuition
    public void payTuition() {
        viewBalance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to pay");
        int payment = input.nextInt();
        tuitionBalance -= payment;
        System.out.println("Your payment of " + payment + " has been accepted");
        viewBalance();
    }
    //Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName + 
                "\nStudent ID: " + studentID + 
                "\nGrade year: " + year +
                "\nCourses enrolled: " + courses +
                "\nTuitionBalance: $" + tuitionBalance;
    }
}
