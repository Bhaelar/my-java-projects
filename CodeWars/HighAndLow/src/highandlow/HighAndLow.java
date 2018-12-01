/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highandlow;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Modupe Okenla
 */
public class HighAndLow {
    public static String highAndLow(String numbers) {
    // Code here or
    ArrayList<String> numberlist = new ArrayList<String>();
    int max = 0;
    int min = 100;
    int l;
    for(String word : numbers.split(" ")) {
        numberlist.add(word);
    }
    for (int j = 0 ; j < numberlist.size() ; j++) {
        l = Integer.parseInt(numberlist.get(j));
        if (l > max)
            max = l;
        
    }
    for (int k = 0 ; k < numberlist.size() ; k++) {
        l = Integer.parseInt(numberlist.get(k));
        if (l < min)
            min = l;
    }
    String s = max + " " + min;
    
    return s;
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    
}
