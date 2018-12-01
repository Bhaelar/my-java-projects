/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartratecalculator;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class HeartRateCalculator {
public String firstName;
public String lastName;
public int age;
public int maxRate;
public HeartRateCalculator(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getFirstName() {
    return firstName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getLastName() {
    return lastName;
}
public void setAge(int age) {
    this.age = age;
}
public int getAge() {
    return age;
}
public static int maxHeartRate(int age) {
    int maxRate = 220 - age;
    return maxRate;
}
public static void getTargetHeartRate(int maxRate) {
    int lowerRange = (50 * maxRate/ 100);
    int higherRange = (85 * maxRate / 100);
    System.out.println("Range is " + lowerRange + " to " + higherRange);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String a = input.nextLine();
        System.out.println("Enter last name");
        String b = input.nextLine();
        System.out.println("Enter age");
        int c = input.nextInt();
        HeartRateCalculator person = new HeartRateCalculator(a,b,c);
        System.out.println("Your maximum heart rate is " + maxHeartRate(c));
        getTargetHeartRate(maxHeartRate(c));
    }
    
}
