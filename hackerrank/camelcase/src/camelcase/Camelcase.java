/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camelcase;

/**
 *
 * @author Modupe Okenla
 */
public class Camelcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
    static int camelcase(String s) {
        String[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        int num = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            for(int j = 0 ; j < upper.length ; j++) {
                if(s.substring(i,i+1).equals(upper[j])) {
                    num++;
                }
            }
        }
        return num + 1;
    }
}
