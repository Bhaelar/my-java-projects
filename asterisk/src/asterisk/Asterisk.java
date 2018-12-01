/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterisk;

/**
 *
 * @author Modupe Okenla
 */
public class Asterisk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,k;
        for(i=1;i<=10;i++) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        System.out.println();
        for (i=10;i>=1;i--) {
            for (j=1;j<=i;j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (i=10;i>=1;i--) {
            for (k=9;k>=i;k--) {
                        System.out.print(" ");
                    }
            for (j=1;j<=i;j++) {
                    
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (i=1;i<=10;i++) {
            for (k=9;k>=i;k--) {
                        System.out.print(" ");
                    }
            for (j=1;j<=i;j++) {
                    
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
