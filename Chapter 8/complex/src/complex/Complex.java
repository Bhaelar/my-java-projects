/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Complex {
    private int a;
    private int b;
    private int c;
    private int d;
    
    public static void addNum(int a,int b,int c,int d) {
        int real = a + c;
        int imag = b + d;
        System.out.println("The result is " + real + " + " +imag + "i");
    }
    public static void subNum(int a,int b,int c,int d) {
        int real = a - c;
        int imag = b - d;
        System.out.println("The result is " + real + " + " +imag + "i");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        addNum(5,2,3,4);
    }
    
}
