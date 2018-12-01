/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorastriple;

/**
 *
 * @author Modupe Okenla
 */
public class PythagorasTriple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,k;
        for (i=1;i<=500;i++) {
            for (j=1;j<=500;j++) {
                for (k=1;k<+500;k++) {
                    if ((i*i)+(j*j)==(k*k)) {
                        System.out.println(i +"  " +j+"  " + k);
                    }
                }
            }
        }
    }
    
}
