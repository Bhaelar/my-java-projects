/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

/**
 *
 * @author Modupe Okenla
 */
public class Emailapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        email em1 = new email("Okenla","Basit");
        System.out.println(em1.showInfo());
    }
    
}
