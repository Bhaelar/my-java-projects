/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catsandamouse;

/**
 *
 * @author Modupe Okenla
 */
public class Catsandamouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(catAndMouse(1,3,2));
    }
    static String catAndMouse(int x, int y, int z) {
        String answer = "";
        if(Math.abs(y-z) < Math.abs(x-z)) {
            answer = "Cat B";
        }
        else if(Math.abs(y-z) > Math.abs(x-z)) {
            answer = "Cat A";
        }
        else {
            answer = "Mouse C";
        }
        return answer;
    }
}
