/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Modupe Okenla
 */
public class Bankaccountapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* checking chkacc1 = new checking("Tom Wilson","321456789",1500);
        savings svgacc1 = new savings("Tom Wilson","320456789",2500);
        chkacc1.compound();
        chkacc1.showInfo(); */
        List<account> accountHolder = new LinkedList<account>();
        
        String file = "C:\\Users\\Modupe Okenla\\Downloads\\NewBankAccounts.csv";
        List<String[]> accounts = bankaccountapp.utilities.CSV.read(file);
        for(String[] account : accounts) {
            String name = account[0];
            String sSN = account[1];
            String accountType = account[2];
            double initDeposit = Double.parseDouble(account[3]);
            if(accountType.equals("Savings")) {
                accountHolder.add(new savings(name,sSN,initDeposit));
            }
            if(accountType.equals("Checking")) {
                accountHolder.add(new checking(name,sSN,initDeposit));
            }
        }
        for(account acc : accountHolder) {
            acc.showInfo();
        }
    }
    
}
