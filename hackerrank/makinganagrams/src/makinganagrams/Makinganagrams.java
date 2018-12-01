/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makinganagrams;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class Makinganagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(check("absdjkvuahdakejfnfauhdsaavasdlkj","djfladfhiawasdkjvalskufhafablsdkashlahdfa"));
        //System.out.println(Math.min(2,2));
    }
    public static int check(String s1 , String s2) {
        ArrayList<String> s1list = new ArrayList<String>();
        ArrayList<String> s2list = new ArrayList<String>();
        ArrayList<Integer> s3list = new ArrayList<Integer>();
        ArrayList<Integer> s4list = new ArrayList<Integer>();
        for(int i = 0 ; i < s1.length() ; i++) {
            int count = 0;
            for(int j = 0 ; j < s1list.size() ; j++) {
                if(s1.substring(i,i+1).equals(s1list.get(j))) {
                    count++;
                }
            }
            if(count == 0) {
                s1list.add(s1.substring(i,i+1));
            }
        }
        for(int i = 0 ; i < s2.length() ; i++) {
            int count = 0;
            for(int j = 0 ; j < s2list.size() ; j++) {
                if(s2.substring(i,i+1).equals(s2list.get(j))) {
                    count++;
                }
            }
            if(count == 0) {
                s2list.add(s2.substring(i,i+1));
            }
        }
        for(int i = 0 ; i < s1list.size() ; i++) {
            int count = 0;
            for(int j =0 ; j < s1.length() ; j++) {
                if(s1list.get(i).equals(s1.substring(j,j+1))) {
                    count++;
                }
            }
            s3list.add(count);
        }
        for(int i = 0 ; i < s2list.size() ; i++) {
            int count = 0;
            for(int j =0 ; j < s2.length() ; j++) {
                if(s2list.get(i).equals(s2.substring(j,j+1))) {
                    count++;
                }
            }
            s4list.add(count);
        }
        int answer = 0;
        for(int i = 0 ; i < s1list.size() ; i++) {
            for(int j = 0 ; j < s2list.size() ; j++) {
                if(s1list.get(i).equals(s2list.get(j))) {
                    if(s3list.get(i) == s4list.get(j)) {
                        answer += s3list.get(i) * 2;
                    } else {
                        answer += (Math.min(s3list.get(i),s4list.get(j))) * 2;
                    }
                    
                }
            }
        }
        return s1.length() + s2.length() - answer;
    }
}
