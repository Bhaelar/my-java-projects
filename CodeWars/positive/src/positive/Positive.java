/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positive;

/**
 *
 * @author Modupe Okenla
 */
public class Positive {
    public static int sum(int[] arr){
        int answer = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > 0) {
                answer += arr[i];
            }
        }
        if (arr.length == 0 ) {
            answer = 0;
        }
        return answer;
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
