/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intstream_operations;
import java.util.Arrays;
import java.util.stream.IntStream;
/**
 *
 * @author Modupe Okenla
 */
public class Intstream_operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        System.out.print("Original values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();
    }
    
}
