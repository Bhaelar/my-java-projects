/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _160805021_okenla_assignment3;

/**
 *
 * @author Modupe Okenla
 */
public class _160805021_Okenla_assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        convert();
        
    }
    public static double eqn1(double x) {
        double eqn1 = Math.pow((x-2),4);
        return eqn1;
    }
    public static double eqn2(double x) {
        double eqn2 = 4 * Math.pow((x-2),3);
        return eqn2;
    }
    public static void convert() {
        double [] list = new double[4];
        list[0] = 2.1;
        double [] abs = new double[3];
        double [] rel = new double[3];
        double [] per = new double[3];
        for(int i = 1 ; i <= 3 ; i++) {
            list[i] = list[i - 1] - (eqn1(list[i-1]) / eqn2(list[i-1]));
            abs[i - 1] = Math.abs(list[0] - list[i]);
            rel[i - 1] = abs[i -1]/list[0];
            per[i - 1] = 100 * rel[i - 1];
        }
        System.out.printf("n\tX(n)\tAbs Error\tRel Error\tPer Error%n");
        System.out.printf("0\t2.1000\t0.0000\t\t0.0000\t\t0.0000%n");
        for(int i = 1 ; i <= 3 ; i++) {
            System.out.printf("%d\t%.4f\t%.4f\t\t%.4f\t\t%.4f\t\t%n",i,list[i],abs[i-1],rel[i-1],per[i-1]);
        }
    }
}
