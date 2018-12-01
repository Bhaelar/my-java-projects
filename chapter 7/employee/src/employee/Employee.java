/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Employee {
public String firstName;
public String lastName;
public double salary;
public Employee(String firstName, String lastName , double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getFirstName() {
    return firstName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getLastName() {
    return lastName;
}
public void setSalary(double salary) {
    if(salary>0.0) {
        this.salary = salary;
    }
        
}
public double getSalary() {
    return salary;
}
public static double setRaise(double salary,int percent) {
    double newSalary = (percent * salary / 100) + salary;
    return newSalary;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee("Jane","Ellen",4500);
        Employee employee2 = new Employee("Bob","Grey",5000);
        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println("Enter the percent raise");
        int percent = input.nextInt();
        System.out.println(setRaise(employee1.salary,percent));
        System.out.println(setRaise(employee2.salary,percent));
    }
    
}
