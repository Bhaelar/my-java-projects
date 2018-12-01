/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateelimination;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
/**
 *
 * @author Modupe Okenla
 */
public class DuplicateElimination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter names: (Enter x to break)");
        ArrayList<String> list = new ArrayList<String>();
        String enter = "";
        while(!"x".equals(enter)) {
            enter = input.nextLine();
            if(!"x".equals(enter)) {
                list.add(enter);
            }
        }
        Set<String> set = new HashSet<>(list);
        for(String name : set) {
            System.out.print(name + "  ");
        }
        System.out.println();
        
        System.out.println("Enter name to search");
        String text = input.nextLine();
        check(list,text);
    }
    public static void check(ArrayList<String> list , String value) {
        int result = 0;
        result = Collections.binarySearch(list,value);
        if(result >= 0) {
            System.out.println(value + " was found in the list.");
        } else {
            System.out.println(value + " wasn't found in the list.");
        }
    }
}
