/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingbook;

/**
 *
 * @author Modupe Okenla
 */
public class DrawingBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(pageCount(5,4));
    }
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        int front = 0;
        int back = 0;
        int pages = (n / 2) + 1;
        for(int i = 2 ; i <= n ; i++) {
            if(i == p) {
                front = i/2;
                back = (n/2) - front;
                break;
            }
        }
        if(front < back) {
            return front;
        } else {
            return back;
        }
    }
}
