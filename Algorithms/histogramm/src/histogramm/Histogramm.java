/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histogramm;

/**
 *
 * @author Modupe Okenla
 */
public class Histogramm {
    public static void histogram(int[] a,int m) {
        int[] array = new int[m];
        int count;
        int total = 0;
        for(int i = 99 ; i >= 0 ; i--) {
            
            count = 0;
            for(int j = 0 ; j < a.length ; j++) {
                if(i == a[j]) {
                    for(int l = 0 ; l < a.length ; l++) {
                        if (a[j] == a[l]) {
                            ++count;
                        }
                        //array[i] = count;
                    }
                    array[i] = count;
                    break;
                }
                
            }
        }
        for(int k = 0 ; k < array.length ; k++) {
            total += array[k];
        }
        if (total == a.length) {
            System.out.println("True");
        }
            
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] b = {0,3,4,2,3,9,7,5,8,1,3,11,4};
        histogram(b,24);
        
    }
    
}
