/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlearea;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("Area is " + getArea(radius));
        
    }
    public static double getArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }
}
