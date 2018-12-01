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
public class savings extends account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    public savings(String name, String ssn , double initDeposit) {
        super(name,ssn,initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.print("NEW SAVINGS ACCOUNT");
        setSavingsDepositBox();
    }
    private void setSavingsDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * 1000);
        safetyDepositBoxKey = (int) (Math.random() * 10000);
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: SAVINGS ACCOUNT");
        super.showInfo();
        System.out.println("SAVINGS DEPOSIT BOX ID: " + safetyDepositBoxID + 
                "\nSAVINGS DEPOSIT BOX KEY: " + safetyDepositBoxKey);
    }
}
