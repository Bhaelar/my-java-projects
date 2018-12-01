/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomsentence;
import java.security.SecureRandom;
/**
 *
 * @author Modupe Okenla
 */
public class RandomSentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 0 ; i < 20 ; i++) {
            System.out.println(randomnizer());
        }
    }
    public static String randomnizer() {
        String[] article = {"the" , "a" , "one" , "some" , "any" };
        String[] noun = { "boy" , "girl" , "dog" , "town", "car"};
        String[] verb = {"drove" , "jumped" , "ran" , "walked" , "skipped"};
        String[] preposition = { "to" , "from" , "over" , "under" , "on" };
        SecureRandom rand = new SecureRandom();
        int a = rand.nextInt(5);
        String word = article[rand.nextInt(5)] +" " + noun[rand.nextInt(5)] + " " + verb[rand.nextInt(5)] + " " + preposition[rand.nextInt(5)] + " " + article[rand.nextInt(5)] + " " + noun[rand.nextInt(5)] + ".";
        return word;
    }
}
