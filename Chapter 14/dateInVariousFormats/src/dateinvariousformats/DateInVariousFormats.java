/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateinvariousformats;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class DateInVariousFormats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date in the format : MM/DD/YYYY");
        String date = input.nextLine();
        convert(date);
    }
    public static void convert(String date) {
        String [] tokens = date.split("/");
        String month = "";
        if(tokens[0].equals("01")) {
            month = "January";
        } 
        if(tokens[0].equals("02")) {
            month = "February";
        }
        if(tokens[0].equals("03")) {
            month = "March";
        }
        if(tokens[0].equals("04")) {
            month = "April";
        }
        if(tokens[0].equals("05")) {
            month = "May";
        }
        if(tokens[0].equals("06")) {
            month = "June";
        }
        if(tokens[0].equals("07")) {
            month = "July";
        }
        if(tokens[0].equals("08")) {
            month = "August";
        }
        if(tokens[0].equals("09")) {
            month = "September";
        }
        if(tokens[0].equals("10")) {
            month = "October";
        }
        if(tokens[0].equals("11")) {
            month = "November";
        }
        if(tokens[0].equals("12")) {
            month = "December";
        }
        System.out.println(month + " " + tokens[1] + ", " + tokens[2] );
    }
}
