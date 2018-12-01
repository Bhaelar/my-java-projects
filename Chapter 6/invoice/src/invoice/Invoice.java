/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Invoice {
    public String number;
    public String description;
    public int quantity;
    public double price;
    
    public Invoice(String number,String description, int quantity, double price) {
        this.number = number;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    
    public static double getInvoiceAmount(int quantity,double price) {
        if(quantity < 0)
            quantity = 0;
        if(price < 0)
            price = 0.0;
        double amount = quantity * price;
        return amount;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Invoice invoiceTest = new Invoice("1","shirt",3,4.5);
        double m = getInvoiceAmount(3,4.5);
        System.out.println(m);
    }
    
}
