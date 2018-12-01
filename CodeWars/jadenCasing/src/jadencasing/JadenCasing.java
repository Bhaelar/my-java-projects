/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadencasing;
import org.apache.commons.lang.text.WordUtils;
/**
 *
 * @author Modupe Okenla
 */
public class JadenCasing {
    public static String capitalize(String s) {
        s = WordUtils.capitalize(s);
        return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String t = capitalize("I am a boy");
        System.out.println(t);
    }
    
}
