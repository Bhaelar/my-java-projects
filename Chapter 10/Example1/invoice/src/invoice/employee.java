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
public abstract class employee implements payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    public employee(String firstName, String lastName,String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFirstName(){
        return firstName;
    }
     public String getLastName(){
        return lastName;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    // return String representation of Employee object
    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s",getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
