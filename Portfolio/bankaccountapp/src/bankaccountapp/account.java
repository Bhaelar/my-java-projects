/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

/**
 *
 * @author Modupe Okenla
 */
public abstract class account implements iBaseRate {
    //List common properties for both accounts
    private String name;
    private String ssn;
    private double balance;
    
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;
    //Define constructor
    public account(String name , String ssn , double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;
        
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }
    private String setAccountNumber() {
        return ssn.substring(ssn.length()-2,ssn.length()) + index + (int)(Math.random() * 1000);
    }
    public void compound() {
        double interest = balance * (rate/100);
        balance += interest;
        
    }
    public abstract void setRate();
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void transfer(String toWhere , double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
    }
    public void showInfo() {
        System.out.println("NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%"
                );
    }
    
}
