/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wholikes;

/**
 *
 * @author Modupe Okenla
 */
public class Wholikes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public static String whoLikesIt(String... names) {
        //Do your magic here
        if(names.length == 1) {
            return names[0] +" likes this";
        }
        if(names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        }
        if(names.length == 3) {
            return names[0] + ", " + names[1] + " and "+ names[2] +" like this";
        }
        if(names.length > 3) {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
        return "no one likes this";
    }
}
