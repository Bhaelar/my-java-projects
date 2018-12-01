/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gemstone;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class Gemstone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] a = {"abcdde","baccd","eeabg"};
        System.out.println(gemstones(a));
    }
    static int gemstones(String[] arr) {
        int n =arr.length;
        char c= 'a';
        int[] a = new int[26];
        int count =0;
		for(int i =0; i< n; i++){
			String s = arr[i];
			for(int j=0; j<s.length(); j++)
				if(a[s.charAt(j)%c] == i)
					a[s.charAt(j)%c]++;
		}
		for(int i =0; i<26 ; i++)
			if(a[i] == n) count++;
		return count;
    }
}
