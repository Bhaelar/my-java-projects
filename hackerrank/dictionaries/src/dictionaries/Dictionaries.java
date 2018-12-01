/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaries;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Modupe Okenla
 */
public class Dictionaries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String , Integer> myMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(myMap.containsKey(s)) {
                System.out.println(s + "=" + myMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
    
}
