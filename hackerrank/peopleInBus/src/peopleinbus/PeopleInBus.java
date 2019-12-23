/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopleinbus;

import java.util.ArrayList;

/**
 *
 * @author Modupe Okenla
 */
public class PeopleInBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int count = 0;
        for(int i = 0; i < stops.size(); i++) {
            int check = stops.get(i)[0] - stops.get(i)[1];
            count += check;
        }
        return count;
    }
    
}
