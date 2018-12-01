/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandsquares;

/**
 *
 * @author Modupe Okenla
 */
public class SherlockAndSquares {
    static int squares(int a, int b) {
        int count = (int)(Math.floor(Math.sqrt(b))- Math.ceil(Math.sqrt(a)))+1;
        return count;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(squares(17,66));
    }
    
}
