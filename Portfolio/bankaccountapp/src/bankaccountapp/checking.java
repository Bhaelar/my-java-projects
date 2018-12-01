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
public class checking extends account {
    private int debitCardNumber;
    private int debitCardPIN;
    
    public checking(String name, String ssn , double initDeposit) {
        super(name,ssn,initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.print("NEW CHECKING ACCOUNT");
        setCard();
    }
    public void setCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10,4));
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: CHECKING ACCOUNT");
        System.out.println("DEBIT CARD NUMBER: " + debitCardNumber + 
                "\nDEBIT CARD PIN: " + debitCardPIN);
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }
}
