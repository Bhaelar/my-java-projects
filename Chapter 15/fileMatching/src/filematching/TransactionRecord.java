/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filematching;

/**
 *
 * @author Modupe Okenla
 */
public class TransactionRecord {

    private String accountNumber;
    private double amount;
    public TransactionRecord(String accountNumber , double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    TransactionRecord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAmount(double amount) {
       this.amount = amount; 
    }
    public double getAmount() {
        return amount;
    }
    
}