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
public class salariedEmployee extends employee{
    private double weeklySalary;
    public salariedEmployee(String firstName, String lastName,String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
            
        }
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",super.toString(), "weekly salary", getWeeklySalary());
    }
}
    
