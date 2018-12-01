/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavity;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Modupe Okenla
 */
public class Cavity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] grid = {"1112","1912","1892","1234"};
        System.out.println(Arrays.toString(cavityMap(grid)));
    }
    static String[] cavityMap(String[] grid) {
        //ArrayList<String> check = new ArrayList<String>();
        for(int i = 1 ; i < grid.length - 1 ; i++) {
            for(int j = 1 ; j < grid[i].length() - 1 ; j++) {
                if(grid[i].charAt(j) > grid[i].charAt(j-1) && grid[i].charAt(j) > grid[i -1].charAt(j) && grid[i].charAt(j) > grid[i].charAt(j + 1) && grid[i].charAt(j) > grid[i + 1].charAt(j)) {
                    grid[i] = grid[i].substring(0,j) + "X" + grid[i].substring(j+1);
                }
            }
        }
        return grid;
    }
}
