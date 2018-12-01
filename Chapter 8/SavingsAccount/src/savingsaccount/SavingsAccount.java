/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccount;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class SavingsAccount {
private static double annualInterestRate;
private double savingsBalance;
public static double m;
public static double n;
public int b = 2;
public SavingsAccount( double savingsBalance) {
    
    this.savingsBalance = savingsBalance;
}


public static double calculateMonthlyInterest(double savingsBalance,double annualInterestRate,int b) {
    for(int i = 1; i < b ; i++) {
        double interest = (savingsBalance * annualInterestRate) / 1200;
        savingsBalance += interest;
    }
    return savingsBalance;
}
public double a;
public void setSavingsBalance(double a) {
    this.a = a;
}
public double getSavingsBalance() {
    return a;
}
public static void modifyInterestRate() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter new interest rate: ");
    double newInterestRate = input.nextDouble();
    annualInterestRate = newInterestRate;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SavingsAccount savingsAccount1 = new SavingsAccount(2000);
        SavingsAccount savingsAccount2 = new SavingsAccount(3000);
        annualInterestRate = 4;
        
        
            m = calculateMonthlyInterest(savingsAccount1.savingsBalance ,annualInterestRate , 12 );
            
            n = calculateMonthlyInterest(savingsAccount2.savingsBalance ,annualInterestRate , 12 );
            
        
        savingsAccount1.setSavingsBalance(m);
        savingsAccount2.setSavingsBalance(n);
        System.out.println("New savings1 balance is " + savingsAccount1.getSavingsBalance());
        System.out.println("New savings2 balance is " + savingsAccount2.getSavingsBalance());
        modifyInterestRate();
        savingsAccount1.calculateMonthlyInterest(savingsAccount1.savingsBalance ,savingsAccount1.annualInterestRate , 1 );
        savingsAccount2.calculateMonthlyInterest(savingsAccount2.savingsBalance ,savingsAccount2.annualInterestRate , 1);
        System.out.println("New savings1 balance is " + savingsAccount1.savingsBalance);
        System.out.println("New savings2 balance is " + savingsAccount2.savingsBalance);
    }
    
}
