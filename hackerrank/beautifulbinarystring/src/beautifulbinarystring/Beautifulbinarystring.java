/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautifulbinarystring;

/**
 *
 * @author Modupe Okenla
 */
public class Beautifulbinarystring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(beautifulBinaryString("0100101010"));
    }
    static int beautifulBinaryString(String b) {
        int count = 0;
        StringBuilder b1 = new StringBuilder(b);
        for(int i = 0 ; i < b1.length() ; i++) {
            int check = 0;
            if(b1.substring(i,i+1).equals("0")) {
                if(i + 2 < b.length()) {
                    if(b1.substring(i + 1,i + 2).equals("1") && b1.substring(i + 2,i + 3).equals("0")) {
                        ++check;
                    }
                }
                if(check > 0) {
                    b1.delete(i + 2,i + 3);
                    b1.insert(i+2, "1");
                    count++;
                }
            }
        }
        return count;
    }
}
