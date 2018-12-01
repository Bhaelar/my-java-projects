/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnastrand;

/**
 *
 * @author Modupe Okenla
 */
public class DnaStrand {
    public static String makeComplement(String dna) {
    //Your code
    String result = "";
    for(int i = 0 ; i < dna.length() ; i++) {
      char c = dna.charAt(i);
      if(c == 'T') {
          result += "A";
      }
      if(c == 'A') {
          result += "T";
      }
      if(c == 'G') {
          result += "C";
      }
      if(c == 'C') {
          result += "G";
      }
    }
    return result;
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(makeComplement("GTAT"));
    }
    
}
