/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designerpdfviewer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Modupe Okenla
 */
public class Designerpdfviewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] h = {6, 5, 7, 3, 6, 7, 3, 4, 4, 2, 3, 7, 1, 3, 7, 4, 6, 1, 2, 4, 3, 3, 1, 1, 3, 5};
        System.out.println(designerPdfViewer(h,"zbkkfhwplj"));
    }
    static int designerPdfViewer(int[] h, String word) {
        String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
        int area = 1;
        String[] list = word.split("");
        ArrayList<Integer> high = new ArrayList<Integer>();
        for(int i = 0 ; i < list.length ; i++) {
            for(int j = 0 ; j < alphabets.length ; j++) {
                if(list[i].equals(alphabets[j])) {
                    high.add(h[j]);
                }
            }
        }
        Collections.sort(high);
        return high.get(high.size()-1) * word.length();
    }
}
