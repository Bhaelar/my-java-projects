/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appenanddelete;

/**
 *
 * @author Modupe Okenla
 */
public class Appenanddelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "hackerhappy";
        String t = "hackerrank";
        
        //System.out.println(s.substring(0,s.length() - 5));
        //System.out.println(t.substring(t.length() - 5,t.length() - 4));
        System.out.println(appendAndDelete("abcd","abcdert",10));
    }
    static String appendAndDelete(String s, String t, int k) {
        String result = "No";
        String a = "" + s;
        for(int i = 0 ; i < k ; i++) {
            if(t.equals(a)) {
                result = "Yes";
                break;
            }
            if(t.length() >= a.length()) {
                if(a.equals(t.substring(0,a.length()))) {
                    //System.out.println("Yes");
                    for(int c = i ; c > k - i ; c--) {
                        a += t.substring(t.length()-(c - 1),t.length() -(c - 2));
                        //System.out.println(a);
                        
                        if(t.equals(a)) {
                            result = "Yes";
                            break;
                        }
                    }
                    break;
                }
            }
            if(!t.equals(a)){
                a = s.substring(0,s.length() - i - 1);
                //System.out.println(a);
                if(t.equals(a)) {
                    result = "Yes";
                    break;
                }
            }
            if("".equals(a)) {
                for(int c = 0 ; c < k - i ; c++) {
                    a += t.substring(c,c+1);
                    if(t.equals(a)) {
                        result = "Yes";
                        break;
                    }
                    
                }
                break;
            }
        }
        return result;
    }
}
