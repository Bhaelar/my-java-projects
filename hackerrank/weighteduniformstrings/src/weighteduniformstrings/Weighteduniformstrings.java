
package weighteduniformstrings;

import java.util.ArrayList;


public class Weighteduniformstrings {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] q = {1,3,12,5,9,10};
        System.out.println(weightedUniformStrings("abccddde",q));
    }
    static String[] weightedUniformStrings(String s, int[] queries) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<String> arr5 = new ArrayList<String>();
        String[] arr2 = "abcdefghijklmnoprstuvwxyz".split("");
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        String[] arr4 = new String[queries.length];
        String s1 = "";
        for(int i = 0 ; i < s.length() ; i++) {
            
            s1 += s.substring(i,i+1);
            arr5.add(s1);
            
            if(i != s.length() - 1) {
            if(s.charAt(i) != s.charAt(i + 1) ) {
                s1 = "";
            }
            }
        }
        for(int i = 0 ; i < arr5.size() ; i++) {
            int a = 0;
            for(int j = 0 ; j < arr5.get(i).length() ; j++) {
                for(int k = 0; k < arr2.length ; k++) {
                    if(arr5.get(i).substring(j,j+1).equals(arr2[k])) {
                        a += arr3[k];
                    }
                }
            }
            arr1.add(a);
        }
        for(int i = 0 ; i < queries.length ; i++) {
            int a = 0;
            for(int j = 0 ; j < arr1.size() ; j++) {
                if(queries[i] == arr1.get(j)) {
                    a++;
                }
            }
            if(a > 0) {
                arr4[i] = "Yes";
            }
            else {
                arr4[i] = "No";
            }
        }
        return arr4;
    }
}
