/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filematching;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author Modupe Okenla
 */
public class FileMatching {

    /**
     * @param args the command line arguments
     */
    private static Formatter output;
    public static void main(String[] args) {
        // TODO code application logic here
        addRecords();
    }
    public static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ","Enter account number, first name, last name and balance.","Enter end-of-file indicator to end input.");

        while (input.hasNext()){
            try {
                output.format("%s %s %s %.2f%n", input.nextLine(),input.next(), input.next(), input.nextDouble());
            }
            catch (FormatterClosedException formatterClosedException){
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            catch (NoSuchElementException elementException){
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }
            System.out.print("? ");
        } // end while
    } 
}
