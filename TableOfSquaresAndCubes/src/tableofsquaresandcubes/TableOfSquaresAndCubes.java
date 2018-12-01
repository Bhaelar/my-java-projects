/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableofsquaresandcubes;

/**
 *
 * @author Modupe Okenla
 */
public class TableOfSquaresAndCubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0;
        System.out.println("Number   Square   Cube");
        for(number = 0;number<11;number++) {
            int square = number * number;
            int cube = square * number;
            System.out.println(number + "         "+square+"         "+cube);
        }
        
    }
    
}
