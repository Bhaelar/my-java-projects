/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisasworkbook;

/**
 *
 * @author Modupe Okenla
 */
public class Lisasworkbook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr ={4, 2, 6, 1, 10};
        System.out.println(workbook(5,3,arr));
    }
    static int workbook(int n, int k, int[] arr) {
        int page = 0;
        int special = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            int problem = 0;
            int s = arr[i];
            while(s > k) {
                page++;
                //System.out.println(page);
                for(int j = 0 ; j < k ; j++) {
                    problem++;
                    System.out.println(problem);
                    if(problem == page) {
                        ++special;
                    }
                }
                s -= k;
            } 
            while(s <= k) {
                page++;
                //System.out.println(page);
                for(int j = 1 ; j <= s ; j++) {
                    problem++;
                    System.out.println(problem);
                    if(problem == page) {
                        special++;
                    }
                }
                break;
            }
        }
        return special;
    }
}
