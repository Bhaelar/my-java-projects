/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author Modupe Okenla
 */
public class email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String alternateMail;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String email;
    
    //Constructor here
    public email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        
        this.department = setDepartment();
 
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Pasword: " + this.password);
        
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + ".kushcompany.com";
    }
    //Ask for department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES \n1. Sales \n2. Development \n3. Accounting\n0. none\nEnter Department Code: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if(choice == 1) {return "Sales";}
        else if(choice == 2) {return "Development";}
        else if(choice == 3) {return "Accounting";}
        else {return "";}
    }
    //generate random password
    private String randomPassword(int length) {
        String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] password = new char[length];
        for(int i = 0 ; i < length ; i++) {
            int rand = (int)(Math.random() * passwordset.length());
            password[i] = passwordset.charAt(rand);
        }
        return new String(password);
    }
    //set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    //set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateMail = altEmail;
    }
    
    public String getAlternateEmail() {
        return alternateMail;
    }
    //change password
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity;
    }
}
