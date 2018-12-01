/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filematching;
import java.io.Serializable;
/**
 *
 * @author Modupe Okenla
 */
public class Account implements Serializable{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    private String accountNumber;
    private double amount;
    TransactionRecord transact = new TransactionRecord(accountNumber , amount);
    public Account() {
        this(0, "", "", 0.0); // call other constructor
    }
    public Account(int account, String firstName,String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public void setAccount(int acct) {
        this.account = account;
    }
// get account number
    public int getAccount() {
        return account;
    }
 // set first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
 // get first name
    public String getFirstName(){
        return firstName;
    }
 // set last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
 // get last name
    public String getLastName(){
        return lastName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
 // get balance
    public double getBalance() {
        return balance;
    }
    public double combine() {
        return getBalance() + transact.getAmount();
    }
}
