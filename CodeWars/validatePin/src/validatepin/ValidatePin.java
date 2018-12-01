/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatepin;

/**
 *
 * @author Modupe Okenla
 */
public class ValidatePin {
    public static boolean validatePin(String pin) {
    // Your code here...
        boolean result = true;
        if (pin.length() == 4 || pin.length() == 6) {
            for(int i = 0 ; i < pin.length() ; i++) {
                char c = pin.charAt(i);
                if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c=='0') {
                    result = true;
                    
                    
                    
                } else {
                    result = false;
                    break;
                }
            }
            
        } else {
            result = false;
            return result;
        }
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(validatePin("2.y8"));
    }
    
}
