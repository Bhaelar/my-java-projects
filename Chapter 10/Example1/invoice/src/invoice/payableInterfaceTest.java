/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author Modupe Okenla
 */
public class payableInterfaceTest {
    public static void main (String [] args) {
        payable[] payableObjects = new payable[4];
        payableObjects[0] = new invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new salariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new salariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
        
        System.out.println("Invoices and Employees processed polymorphically:");
        for (payable currentPayable : payableObjects){
            // output currentPayable and its appropriate payment amount
            System.out.printf("%n%s %n%s: $%,.2f%n",currentPayable.toString(),"payment due", currentPayable.getPaymentAmount());}
        }
}
