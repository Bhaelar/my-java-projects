/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commacode;

/**
 *
 * @author Modupe Okenla
 */
public class CommaCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] wordlist = {"apples","bananas","guavas","peas"};
        System.out.println(getWord(wordlist));
    }
    public static String getWord(String [] list) {
        String word = "'";
        for(int i = 0 ; i < list.length ; i++) {
            if (i == list.length - 1) {
                word += "and " + list[i] + "'";
                break;
            }
            word += list[i];
            word += " , ";
        } 
        return word;
    }
}
