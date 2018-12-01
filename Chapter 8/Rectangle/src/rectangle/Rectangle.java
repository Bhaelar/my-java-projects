/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Rectangle {
double length = 1;
double width = 1;
public void setLength(double length) {
    if(length > 0.0 && length < 20.0) {
        this.length = length;
    }
}
public double getLength() {
    return length;
}
public void setWidth(double width) {
    if(width > 0.0 && width < 20.0) {
        this.width = width;
    }
}
public double getWidth() {
    return width;
}
public static double perimeter(double width,double length) {
    double perimeter = 2 * (width + length);
    return perimeter;
}
public static double area(double width , double length) {
    double area = width * length;
    return area;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Enter the width of a rectangle: ");
        double w = input.nextDouble();
        rectangle1.setWidth(w);
        System.out.println("Enter the length of a rectangle: ");
        double l = input.nextDouble();
        rectangle1.setLength(l);
        System.out.println("The perimeter of the rectangle is " + rectangle1.perimeter(w,l));
        System.out.println("The area of the rectangle is " + rectangle1.area(w,l));
    }
    
}
