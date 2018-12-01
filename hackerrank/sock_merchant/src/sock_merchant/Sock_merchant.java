/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sock_merchant;
import java.util.ArrayList;
/**
 *
 * @author Modupe Okenla
 */
public class Sock_merchant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ar = {10, 20, 20, 10, 10 ,30, 50, 10, 20};
        System.out.println(sockMerchant(9,ar));
    }
    static int sockMerchant(int n, int[] ar) {
        
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        ArrayList<Integer> countlist = new ArrayList<Integer>(); 
        list.add(ar[0]);
        for(int i = 1 ; i < n ; i++) {
            for(int j = 0 ; j < list.size() ; j++) {
                if(ar[i] == list.get(j)) {
                    break;
                }
                if((ar[i] != list.get(j)) && j == list.size() -1) {
                    list.add(ar[i]);
                    break;
                }
            }
            
        }
        System.out.println(list);
        for (int i = 0 ; i < list.size() ; i++) {
            int count = 0;
            for(int j = 0 ; j < ar.length ; j++) {
                if(list.get(i) == ar[j]) {
                    ++count;
                }
            }
            countlist.add(count);
        }
        System.out.println(countlist);
        int counting = 0;
        for (int i = 0 ; i < list.size() ; i++) {
            if(countlist.get(i) >= 2) {
                counting += countlist.get(i) / 2;
                
            }
        }
        return counting;
    }
}
