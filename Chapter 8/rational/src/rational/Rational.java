/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rational;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class Rational {
private static int numerator1;
private static int numerator2;
private static int denominator1;
private static int denominator2;
public void setNumerator1(int numerator1) {
    this.numerator1 = numerator1;
}
public void setNumerator2(int numerator2) {
    this.numerator2 = numerator2;
}
public void setDenominator1(int denominator1) {
    this.denominator1 = denominator1;
}
public void setDenominator2(int denominator2) {
    this.denominator2 = denominator2;
}
public Rational() {
    for(int i = 2; i < numerator1; i ++) {
        for(int j = 2; j < 1000 ; j++ ) {
            if(numerator1%i==0 && denominator1%i==0) {
                numerator1 = numerator1 / i;
                denominator1 = denominator1 / i;
            }
        }
    }
    this.numerator1 = numerator1;
    this.denominator1 = denominator1;
    for(int i = 2; i < numerator2; i ++) {
        for(int j = 2; j < 1000 ; j++ ) {
            if(numerator2%i==0 && denominator2%i==0) {
                numerator2 = numerator2 / i;
                denominator2 = denominator2 / i;
            }
        }
    }
    this.numerator2 = numerator2;
    this.denominator2 = denominator2;
}

public int getNumerator1() {
    return numerator1;
}
public int getNumerator2() {
    return numerator2;
}
public int getDenominator1() {
    return denominator1;
}
public int getDenominator2() {
    return denominator2;
}

public static void addRational(int numerator1,int denominator1,int numerator2,int denominator2) {
    int add1 = 0;
    int add2 = 0;
    int lcm = (denominator1 > denominator2) ? denominator1 : denominator2;
    if(denominator1 == denominator2) {
        add1 = numerator1 + numerator2;
        add2 = denominator1;
    } else {
        while(true) {
            if(lcm%denominator1 == 0 && lcm%denominator2 == 0) {
                add1 = (lcm / denominator1 * numerator1) + (lcm / denominator2 * numerator2);
                add2 = lcm;
                break;
            }
            ++lcm;
        }
    }
    for(int i = 2; i < add2; i ++) {
        for(int j = 2; j < 1000 ; j++ ) {
            if(add2%i==0 && add1%i==0) {
                add1 = add1 / i;
                add2 = add2 / i;
            }
        }
    }
    System.out.println("Addition is " + add1 + "/" + add2);
}
public static void subRational(int numerator1,int denominator1,int numerator2,int denominator2) {
    int sub1 = 0;
    int sub2 = 0;
    int lcm = (denominator1 > denominator2) ? denominator1 : denominator2;
    if(denominator1 == denominator2) {
        sub1 = numerator1 - numerator2;
        sub2 = denominator1;
    } else {
        while(true) {
            if(lcm%denominator1 == 0 && lcm%denominator2 == 0) {
                sub1 = (lcm / denominator1 * numerator1) - (lcm / denominator2 * numerator2);
                sub2 = lcm;
                break;
            }
            ++lcm;
        }
    }
        for(int i = 2; i < sub2; i ++) {
        for(int j = 2; j < 1000 ; j++ ) {
            if(sub2%i==0 && sub1%i==0) {
                sub1 = sub1 / i;
                sub2 = sub2 / i;
            }
        }
    }
    System.out.println("Subtraction is " + sub1 + "/" + sub2);
}

public static void mulRational(int numerator1,int denominator1,int numerator2,int denominator2) {
    int mul1 = numerator1 * numerator2;
    int mul2 = denominator1 * denominator2;
    for(int i = 2; i < mul2; i ++) {
        for(int j = 2; j < 1000 ; j++ ) {
            if(mul2%j==0 && mul1%j==0) {
                mul1 = mul1 / j;
                mul2 = mul2 / j;
            }
        }
    }
    System.out.println("Multiplication is " + mul1 + "/" + mul2);
}

public static void divRational(int numerator1,int denominator1,int numerator2,int denominator2) {
    int div1 = 0;
    int div2 = 0;
    
    div1 = numerator1 * denominator2;
    div2 = denominator1 * numerator2;
    for(int i = 2; i < div2; i ++) {
        for(int j = 2; j < 1000 ; j++ ) {
            if(div2%i==0 && div1%i==0) {
                div1 = div1 / i;
                div2 = div2 / i;
            }
        }
    }
    System.out.println("Division is " + div1 + "/" + div2);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Rational rationaltest = new Rational();
        System.out.println("Enter first fraction");
        numerator1 = input.nextInt();
        rationaltest.setNumerator1(numerator1);
        denominator1 = input.nextInt();
        rationaltest.setDenominator1(denominator1);
        System.out.println("Enter second fraction");
        numerator2 = input.nextInt();
        rationaltest.setNumerator2(numerator2);
        denominator2 = input.nextInt();
        rationaltest.setDenominator2(denominator2);
        divRational(numerator1,denominator1,numerator2,denominator2);
        
    }
    
}
