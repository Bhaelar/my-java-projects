/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingduplicatewords;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Modupe Okenla
 */
public class CountingDuplicateWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        display(myMap);
    }
    public static void createMap(Map<String,Integer> myMap) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String text = input.nextLine();
        String [] tokens = text.split(" ");
        for(String letter : tokens) {
            String word = letter.toLowerCase();
            if(myMap.containsKey(word)) {
                int count = myMap.get(word);
                myMap.put(word,count + 1);
            }
            else {
                myMap.put(word,1);
            }
        }
    }
    public static void display(Map <String , Integer> myMap) {
        int result = 0;
        
        for(String l : myMap.keySet()) {
            
            if(myMap.get(l) > 1) {
                ++result;
            }
        }
        System.out.println(result);
    }
}
